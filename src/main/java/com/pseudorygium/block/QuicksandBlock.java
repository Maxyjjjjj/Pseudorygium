
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModItems;

public class QuicksandBlock extends Block {
	public QuicksandBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.SUSPICIOUS_SAND).strength(1f, 10f).noCollission().speedFactor(0.25f));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
		return new ItemStack(PseudorygiumModItems.QUICKSAND_BUCKET.get());
	}
}
