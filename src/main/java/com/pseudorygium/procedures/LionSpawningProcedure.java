package com.pseudorygium.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.pseudorygium.entity.LionEntity;

@EventBusSubscriber
public class LionSpawningProcedure {
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
		if (Math.random() == 0.4) {
			if (entity instanceof LionEntity _datEntSetS)
				_datEntSetS.getEntityData().set(LionEntity.DATA_gender, "male");
		} else {
			if (entity instanceof LionEntity _datEntSetS)
				_datEntSetS.getEntityData().set(LionEntity.DATA_gender, "female");
		}
		return (entity instanceof LionEntity _datEntS ? _datEntS.getEntityData().get(LionEntity.DATA_gender) : "").equals("female") || (entity instanceof LionEntity _datEntS ? _datEntS.getEntityData().get(LionEntity.DATA_gender) : "").equals("male");
	}
}
