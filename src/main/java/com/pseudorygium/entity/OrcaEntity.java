
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class OrcaEntity extends Animal {

	public OrcaEntity(EntityType<OrcaEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (OrcaEntity.this.isInWater())
					OrcaEntity.this.setDeltaMovement(OrcaEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !OrcaEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - OrcaEntity.this.getX();
					double dy = this.wantedY - OrcaEntity.this.getY();
					double dz = this.wantedZ - OrcaEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * OrcaEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					OrcaEntity.this.setYRot(this.rotlerp(OrcaEntity.this.getYRot(), f, 10));
					OrcaEntity.this.yBodyRot = OrcaEntity.this.getYRot();
					OrcaEntity.this.yHeadRot = OrcaEntity.this.getYRot();

					if (OrcaEntity.this.isInWater()) {
						OrcaEntity.this.setSpeed((float) OrcaEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						OrcaEntity.this.setXRot(this.rotlerp(OrcaEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(OrcaEntity.this.getXRot() * (float) (Math.PI / 180.0));

						OrcaEntity.this.setZza(f3 * f1);
						OrcaEntity.this.setYya((float) (f1 * dy));
					} else {
						OrcaEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					OrcaEntity.this.setSpeed(0);
					OrcaEntity.this.setYya(0);
					OrcaEntity.this.setZza(0);
				}
			}
		};

	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected boolean canPerformAttack(LivingEntity entity) {
				return this.isTimeToAttack() && this.mob.distanceToSqr(entity) < (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()) && this.mob.getSensing().hasLineOfSight(entity);
			}

		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ElderGuardian.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, WhiteSharkEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PolarBear.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Guardian.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Drowned.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, PenguinEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, SealEntity.class, false, false));
		this.goalSelector.addGoal(11, new RandomSwimmingGoal(this, 1, 40));
		this.targetSelector.addGoal(12, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));

	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.dolphin.ambient_water"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.dolphin.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.dolphin.death"));
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		OrcaEntity retval = PseudorygiumModEntities.ORCA.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of().test(stack);
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean canDrownInFluidType(FluidType type) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	@Override
	public boolean isPushedByFluid() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level();
		Entity entity = this;
		return false;
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(PseudorygiumModEntities.ORCA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);

		return builder;
	}

}
