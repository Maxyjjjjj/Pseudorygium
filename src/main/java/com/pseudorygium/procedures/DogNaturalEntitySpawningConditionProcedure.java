package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class DogNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world instanceof ServerLevel _level0 && _level0.isVillage(BlockPos.containing(x, y, z));
	}
}
