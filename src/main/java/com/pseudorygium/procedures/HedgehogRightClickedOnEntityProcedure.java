package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class HedgehogRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof HedgehogEntity && !(sourceentity instanceof HedgehogEntity)) {
			sourceentity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("pseudorygium:prick_by_hedgehog")))), 1);
		}
	}
}
