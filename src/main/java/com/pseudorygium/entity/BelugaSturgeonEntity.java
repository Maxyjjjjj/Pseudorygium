
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class BelugaSturgeonEntity extends Animal {

	public BelugaSturgeonEntity(EntityType<BelugaSturgeonEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BelugaSturgeonEntity.this.isInWater())
					BelugaSturgeonEntity.this.setDeltaMovement(BelugaSturgeonEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !BelugaSturgeonEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BelugaSturgeonEntity.this.getX();
					double dy = this.wantedY - BelugaSturgeonEntity.this.getY();
					double dz = this.wantedZ - BelugaSturgeonEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BelugaSturgeonEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					BelugaSturgeonEntity.this.setYRot(this.rotlerp(BelugaSturgeonEntity.this.getYRot(), f, 10));
					BelugaSturgeonEntity.this.yBodyRot = BelugaSturgeonEntity.this.getYRot();
					BelugaSturgeonEntity.this.yHeadRot = BelugaSturgeonEntity.this.getYRot();

					if (BelugaSturgeonEntity.this.isInWater()) {
						BelugaSturgeonEntity.this.setSpeed((float) BelugaSturgeonEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BelugaSturgeonEntity.this.setXRot(this.rotlerp(BelugaSturgeonEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BelugaSturgeonEntity.this.getXRot() * (float) (Math.PI / 180.0));

						BelugaSturgeonEntity.this.setZza(f3 * f1);
						BelugaSturgeonEntity.this.setYya((float) (f1 * dy));
					} else {
						BelugaSturgeonEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BelugaSturgeonEntity.this.setSpeed(0);
					BelugaSturgeonEntity.this.setYya(0);
					BelugaSturgeonEntity.this.setZza(0);
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
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));

	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.salmon.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.salmon.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.salmon.death"));
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		BelugaSturgeonEntity retval = PseudorygiumModEntities.BELUGA_STURGEON.get().create(serverWorld, EntitySpawnReason.BREEDING);
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
		event.register(PseudorygiumModEntities.BELUGA_STURGEON.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER)), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 18);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);

		return builder;
	}

}
