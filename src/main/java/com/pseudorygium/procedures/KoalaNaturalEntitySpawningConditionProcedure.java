package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

public class KoalaNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == PseudorygiumModBlocks.EUCALYPTUS_LEAVES.get();
	}
}
