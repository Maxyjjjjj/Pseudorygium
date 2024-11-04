package com.pseudorygium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModBlocks;

public class KoalaNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == PseudorygiumModBlocks.EUCALYPTUS_LEAVES.get();
	}
}
