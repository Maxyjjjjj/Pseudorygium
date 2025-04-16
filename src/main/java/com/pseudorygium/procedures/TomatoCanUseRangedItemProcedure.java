package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class TomatoCanUseRangedItemProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isShiftKeyDown();
	}
}
