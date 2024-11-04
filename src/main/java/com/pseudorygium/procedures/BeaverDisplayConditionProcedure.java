package com.pseudorygium.procedures;

import net.minecraft.world.entity.Entity;

public class BeaverDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getDisplayName().getString()).equals("kurwa bobr");
	}
}
