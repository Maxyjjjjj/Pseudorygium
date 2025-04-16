package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class EarthwormEntityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().isRaining();
	}
}
