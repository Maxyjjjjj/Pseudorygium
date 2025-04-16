
package com.pseudorygium.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class EagleEntity extends Animal {

	public EagleEntity(EntityType<EagleEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);

	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
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
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (EagleEntity.this.getTarget() != null && !EagleEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return EagleEntity.this.getMoveControl().hasWanted() && EagleEntity.this.getTarget() != null && EagleEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = EagleEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				EagleEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 6);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = EagleEntity.this.getTarget();
				if (EagleEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					EagleEntity.this.doHurtTarget(this.getServerLevel(livingentity), livingentity);
				} else {
					double d0 = EagleEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						EagleEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 6);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 0.8, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = EagleEntity.this.getRandom();
				double dir_x = EagleEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = EagleEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = EagleEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Llama.class, (float) 16, 1, 1.2));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Goat.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DeerEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Sheep.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ChamoisEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, PheasantEntity.class, false, false));
		this.targetSelector.addGoal(10, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(11, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(12, new FloatGoal(this));

	}

	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.parrot.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.parrot.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.parrot.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		EagleEntity retval = PseudorygiumModEntities.EAGLE.get().create(serverWorld, EntitySpawnReason.BREEDING);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), EntitySpawnReason.BREEDING, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of().test(stack);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
		event.register(PseudorygiumModEntities.EAGLE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && world.getRawBrightness(pos, 0) > 8), RegisterSpawnPlacementsEvent.Operation.REPLACE);
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 12);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 6);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);

		builder = builder.add(Attributes.STEP_HEIGHT, 0.6);

		builder = builder.add(Attributes.FLYING_SPEED, 0.3);

		return builder;
	}

}
