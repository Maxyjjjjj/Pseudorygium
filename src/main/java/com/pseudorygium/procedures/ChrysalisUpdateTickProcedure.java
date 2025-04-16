package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class ChrysalisUpdateTickProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof CaterpillarEntity) {
			PseudorygiumMod.queueServerWork(2400, () -> {
				if ((entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : "").equals("peafowl")) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (entity instanceof ButterflyEntity _datEntSetS)
						_datEntSetS.getEntityData().set(ButterflyEntity.DATA_type, (entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : ""));
				}
				if ((entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : "").equals("machaon")) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (entity instanceof ButterflyEntity _datEntSetS)
						_datEntSetS.getEntityData().set(ButterflyEntity.DATA_type, (entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : ""));
				}
				if ((entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : "").equals("monarch")) {
					if (!entity.level().isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (entity instanceof ButterflyEntity _datEntSetS)
						_datEntSetS.getEntityData().set(ButterflyEntity.DATA_type, (entity instanceof CaterpillarEntity _datEntS ? _datEntS.getEntityData().get(CaterpillarEntity.DATA_type) : ""));
				}
			});
		}
	}
}
