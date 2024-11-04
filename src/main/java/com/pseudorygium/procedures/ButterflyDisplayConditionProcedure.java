package com.pseudorygium.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.pseudorygium.entity.ButterflyEntity;

@EventBusSubscriber
public class ButterflyDisplayConditionProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof ButterflyEntity _datEntS ? _datEntS.getEntityData().get(ButterflyEntity.DATA_type) : "").equals("machaon");
	}
}
