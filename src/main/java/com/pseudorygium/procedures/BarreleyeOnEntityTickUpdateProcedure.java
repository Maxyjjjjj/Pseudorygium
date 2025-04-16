package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class BarreleyeOnEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof BarreleyeEntity || entity instanceof WhaleSharkEntity || entity instanceof WhiteSharkEntity || entity instanceof PaddlefishEntity || entity instanceof BelugaSturgeonEntity || entity instanceof ShrimpEntity
				|| entity instanceof CrayfishEntity || entity instanceof JellyfishEntity || entity instanceof SawfishEntity || entity instanceof CarpEntity) {
			while (!entity.isInWater()) {
				for (int index1 = 0; index1 < (int) Double.POSITIVE_INFINITY; index1++) {
					PseudorygiumMod.queueServerWork(20, () -> {
						entity.setAirSupply((int) (entity.getAirSupply() - 1));
					});
				}
			}
		}
	}
}
