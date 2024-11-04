package com.pseudorygium.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModBlocks;
import com.pseudorygium.PseudorygiumMod;

public class HornbeamSaplingUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == PseudorygiumModBlocks.HORNBEAM_SAPLING.get()) {
			PseudorygiumMod.queueServerWork(1200, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level)
					_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("pseudorygium:hornbeam_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(x, y, z));
			});
		}
	}
}
