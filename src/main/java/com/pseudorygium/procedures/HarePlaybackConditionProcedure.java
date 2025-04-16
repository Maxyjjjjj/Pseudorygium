package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class HarePlaybackConditionProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource());
		}
	}

	public static boolean execute(DamageSource damagesource) {
		return execute(null, damagesource);
	}

	private static boolean execute(@Nullable Event event, DamageSource damagesource) {
		if (damagesource == null)
			return false;
		return damagesource.is(DamageTypes.MOB_ATTACK) || damagesource.is(DamageTypes.PLAYER_ATTACK);
	}
}
