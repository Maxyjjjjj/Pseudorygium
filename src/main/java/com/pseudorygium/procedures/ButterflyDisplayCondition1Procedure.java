package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class ButterflyDisplayCondition1Procedure {
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
		return (entity instanceof ButterflyEntity _datEntS ? _datEntS.getEntityData().get(ButterflyEntity.DATA_type) : "").equals("monarch");
	}
}
