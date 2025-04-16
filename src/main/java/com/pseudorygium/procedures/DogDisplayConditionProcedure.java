package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class DogDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false);
	}
}
