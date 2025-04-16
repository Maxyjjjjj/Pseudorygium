
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class SeaLionEntity extends Monster {

	public SeaLionEntity(EntityType<SeaLionEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SeaLionEntity.this.isInWater())
					SeaLionEntity.this.setDeltaMovement(SeaLionEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !SeaLionEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SeaLionEntity.this.getX();
					double dy = this.wantedY - SeaLionEntity.this.getY();
					double dz = this.wantedZ - SeaLionEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SeaLionEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					SeaLionEntity.this.setYRot(this.rotlerp(SeaLionEntity.this.getYRot(), f, 10));
					SeaLionEntity.this.yBodyRot = SeaLionEntity.this.getYRot();
					SeaLionEntity.this.yHeadRot = SeaLionEntity.this.getYRot();

					if (SeaLionEntity.this.isInWater()) {
						SeaLionEntity.this.setSpeed((float) SeaLionEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SeaLionEntity.this.setXRot(this.rotlerp(SeaLionEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SeaLionEntity.this.getXRot() * (float) (Math.PI / 180.0));

						SeaLionEntity.this.setZza(f3 * f1);
						SeaLionEntity.this.setYya((float) (f1 * dy));
					} else {
						SeaLionEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SeaLionEntity.this.setSpeed(0);
					SeaLionEntity.this.setYya(0);
					SeaLionEntity.this.setZza(0);
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
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, TropicalFish.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Pufferfish.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Cod.class, false, false));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(7, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));

	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.generic.death"));
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

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(PseudorygiumModEntities.SEA_LION.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 14);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.3);

		return builder;
	}

}
