package com.pseudorygium.procedures;

import net.neoforged.neoforge.event.entity.player.BonemealEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.pseudorygium.init.PseudorygiumModBlocks;

@EventBusSubscriber
public class BaobabSaplingRightClickedProcedure {
	@SubscribeEvent
	public static void onBonemeal(BonemealEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == PseudorygiumModBlocks.BAOBAB_SAPLING.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("pseudorygium:baobab_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
						BlockPos.containing(x, y, z));
		}
	}
}
