
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class GharialEntity extends Animal {

	public GharialEntity(EntityType<GharialEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.setPathfindingMalus(PathType.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (GharialEntity.this.isInWater())
					GharialEntity.this.setDeltaMovement(GharialEntity.this.getDeltaMovement().add(0, 0.005, 0));

				if (this.operation == MoveControl.Operation.MOVE_TO && !GharialEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - GharialEntity.this.getX();
					double dy = this.wantedY - GharialEntity.this.getY();
					double dz = this.wantedZ - GharialEntity.this.getZ();

					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * GharialEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

					GharialEntity.this.setYRot(this.rotlerp(GharialEntity.this.getYRot(), f, 10));
					GharialEntity.this.yBodyRot = GharialEntity.this.getYRot();
					GharialEntity.this.yHeadRot = GharialEntity.this.getYRot();

					if (GharialEntity.this.isInWater()) {
						GharialEntity.this.setSpeed((float) GharialEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());

						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						GharialEntity.this.setXRot(this.rotlerp(GharialEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(GharialEntity.this.getXRot() * (float) (Math.PI / 180.0));

						GharialEntity.this.setZza(f3 * f1);
						GharialEntity.this.setYya((float) (f1 * dy));
					} else {
						GharialEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					GharialEntity.this.setSpeed(0);
					GharialEntity.this.setYya(0);
					GharialEntity.this.setZza(0);
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
		this.goalSelector.addGoal(2, new TemptGoal(this, 1, Ingredient.of(Items.COD), false));
		this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(Items.SALMON), false));
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1.2));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Salmon.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Cod.class, false, false));
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
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		GharialEntity retval = PseudorygiumModEntities.GHARIAL.get().create(serverWorld, EntitySpawnReason.BREEDING);
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
		event.register(PseudorygiumModEntities.GHARIAL.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(NeoForgeMod.SWIM_SPEED, 0.2);

		builder = builder.add(Attributes.TEMPT_RANGE, 10);

		return builder;
	}

}
