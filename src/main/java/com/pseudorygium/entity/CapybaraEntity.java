
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class CapybaraEntity extends Animal {

	public CapybaraEntity(EntityType<CapybaraEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CapybaraEntity.this.isInWater())
					CapybaraEntity.this.setDeltaMovement(CapybaraEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !CapybaraEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CapybaraEntity.this.getX();
					double dy = this.wantedY - CapybaraEntity.this.getY();
					double dz = this.wantedZ - CapybaraEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CapybaraEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					CapybaraEntity.this.setYRot(this.rotlerp(CapybaraEntity.this.getYRot(), f, 10));
					CapybaraEntity.this.yBodyRot = CapybaraEntity.this.getYRot();
					CapybaraEntity.this.yHeadRot = CapybaraEntity.this.getYRot();

					if (CapybaraEntity.this.isInWater()) {
						CapybaraEntity.this.setSpeed((float) CapybaraEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CapybaraEntity.this.setXRot(this.rotlerp(CapybaraEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CapybaraEntity.this.getXRot() * (float) (Math.PI / 180.0));

						CapybaraEntity.this.setZza(f3 * f1);
						CapybaraEntity.this.setYya((float) (f1 * dy));
					} else {
						CapybaraEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CapybaraEntity.this.setSpeed(0);
					CapybaraEntity.this.setYya(0);
					CapybaraEntity.this.setZza(0);
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
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(4, new FloatGoal(this));

	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("pseudorygium:entity.capybara.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("pseudorygium:entity.capybara.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("pseudorygium:entity.capybara.death"));
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		CapybaraEntity retval = PseudorygiumModEntities.CAPYBARA.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of(PseudorygiumModItems.ORANGE.get(), Items.MELON_SLICE).test(stack);
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
		event.register(PseudorygiumModEntities.CAPYBARA.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
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
