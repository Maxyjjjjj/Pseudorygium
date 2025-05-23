
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class PlatypusEntity extends Animal {

	public PlatypusEntity(EntityType<PlatypusEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (PlatypusEntity.this.isInWater())
					PlatypusEntity.this.setDeltaMovement(PlatypusEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !PlatypusEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - PlatypusEntity.this.getX();
					double dy = this.wantedY - PlatypusEntity.this.getY();
					double dz = this.wantedZ - PlatypusEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * PlatypusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					PlatypusEntity.this.setYRot(this.rotlerp(PlatypusEntity.this.getYRot(), f, 10));
					PlatypusEntity.this.yBodyRot = PlatypusEntity.this.getYRot();
					PlatypusEntity.this.yHeadRot = PlatypusEntity.this.getYRot();

					if (PlatypusEntity.this.isInWater()) {
						PlatypusEntity.this.setSpeed((float) PlatypusEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						PlatypusEntity.this.setXRot(this.rotlerp(PlatypusEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(PlatypusEntity.this.getXRot() * (float) (Math.PI / 180.0));

						PlatypusEntity.this.setZza(f3 * f1);
						PlatypusEntity.this.setYya((float) (f1 * dy));
					} else {
						PlatypusEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					PlatypusEntity.this.setSpeed(0);
					PlatypusEntity.this.setYya(0);
					PlatypusEntity.this.setZza(0);
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

		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new FloatGoal(this));

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
		PlatypusEntity retval = PseudorygiumModEntities.PLATYPUS.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(PseudorygiumModItems.EARTHWORM.get()).test(stack);
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
		event.register(PseudorygiumModEntities.PLATYPUS.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.2);

		return builder;
	}

}
