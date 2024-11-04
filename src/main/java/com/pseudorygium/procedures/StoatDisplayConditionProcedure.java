package com.pseudorygium.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StoatDisplayConditionProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return execute(null, world, x, y, z);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		return world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f <= 0.15;
	}
}
