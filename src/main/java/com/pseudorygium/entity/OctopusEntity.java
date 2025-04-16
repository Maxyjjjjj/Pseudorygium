
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class OctopusEntity extends Animal {

	public OctopusEntity(EntityType<OctopusEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (OctopusEntity.this.isInWater())
					OctopusEntity.this.setDeltaMovement(OctopusEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !OctopusEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - OctopusEntity.this.getX();
					double dy = this.wantedY - OctopusEntity.this.getY();
					double dz = this.wantedZ - OctopusEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * OctopusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					OctopusEntity.this.setYRot(this.rotlerp(OctopusEntity.this.getYRot(), f, 10));
					OctopusEntity.this.yBodyRot = OctopusEntity.this.getYRot();
					OctopusEntity.this.yHeadRot = OctopusEntity.this.getYRot();

					if (OctopusEntity.this.isInWater()) {
						OctopusEntity.this.setSpeed((float) OctopusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						OctopusEntity.this.setXRot(this.rotlerp(OctopusEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(OctopusEntity.this.getXRot() * (float) (Math.PI / 180.0));

						OctopusEntity.this.setZza(f3 * f1);
						OctopusEntity.this.setYya((float) (f1 * dy));
					} else {
						OctopusEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					OctopusEntity.this.setSpeed(0);
					OctopusEntity.this.setYya(0);
					OctopusEntity.this.setZza(0);
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
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1, 40));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Squid.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, GlowSquid.class, false, false));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));

	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.squid.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.squid.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.squid.death"));
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		OctopusEntity retval = PseudorygiumModEntities.OCTOPUS.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(Items.COD, Items.SALMON).test(stack);
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
		event.register(PseudorygiumModEntities.OCTOPUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER)), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);

		return builder;
	}

}
