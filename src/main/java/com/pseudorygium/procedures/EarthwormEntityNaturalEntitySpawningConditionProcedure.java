package com.pseudorygium.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EarthwormEntityNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.getLevelData().isRaining();
	}
}
