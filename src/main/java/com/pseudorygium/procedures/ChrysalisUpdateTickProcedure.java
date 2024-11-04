package com.pseudorygium.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.pseudorygium.init.PseudorygiumModEntities;
import com.pseudorygium.entity.CaterpillarEntity;
import com.pseudorygium.entity.ButterflyEntity;
import com.pseudorygium.PseudorygiumMod;

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
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
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
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
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
						Entity entityToSpawn = PseudorygiumModEntities.BUTTERFLY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
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
