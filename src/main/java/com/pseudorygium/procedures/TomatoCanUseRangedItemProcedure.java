package com.pseudorygium.procedures;

import net.minecraft.world.entity.Entity;

public class TomatoCanUseRangedItemProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isShiftKeyDown();
	}
}
