
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class BarreleyeEntity extends Animal {

	public BarreleyeEntity(EntityType<BarreleyeEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BarreleyeEntity.this.isInWater())
					BarreleyeEntity.this.setDeltaMovement(BarreleyeEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !BarreleyeEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BarreleyeEntity.this.getX();
					double dy = this.wantedY - BarreleyeEntity.this.getY();
					double dz = this.wantedZ - BarreleyeEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BarreleyeEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					BarreleyeEntity.this.setYRot(this.rotlerp(BarreleyeEntity.this.getYRot(), f, 10));
					BarreleyeEntity.this.yBodyRot = BarreleyeEntity.this.getYRot();
					BarreleyeEntity.this.yHeadRot = BarreleyeEntity.this.getYRot();

					if (BarreleyeEntity.this.isInWater()) {
						BarreleyeEntity.this.setSpeed((float) BarreleyeEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BarreleyeEntity.this.setXRot(this.rotlerp(BarreleyeEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BarreleyeEntity.this.getXRot() * (float) (Math.PI / 180.0));

						BarreleyeEntity.this.setZza(f3 * f1);
						BarreleyeEntity.this.setYya((float) (f1 * dy));
					} else {
						BarreleyeEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BarreleyeEntity.this.setSpeed(0);
					BarreleyeEntity.this.setYya(0);
					BarreleyeEntity.this.setZza(0);
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

		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(2, new PanicGoal(this, 1.2));

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
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		BarreleyeEntity retval = PseudorygiumModEntities.BARRELEYE.get().create(serverWorld, EntitySpawnReason.BREEDING);
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

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(PseudorygiumModEntities.BARRELEYE.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
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
