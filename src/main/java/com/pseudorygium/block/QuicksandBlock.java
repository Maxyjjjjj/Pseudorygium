
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class QuicksandBlock extends Block {
	public QuicksandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SUSPICIOUS_SAND).strength(1f, 10f).noCollission().speedFactor(0.25f));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData, Player entity) {
		return new ItemStack(PseudorygiumModItems.QUICKSAND_BUCKET.get());
	}
}