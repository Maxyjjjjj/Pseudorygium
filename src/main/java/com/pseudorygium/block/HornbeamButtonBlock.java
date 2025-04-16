
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HornbeamButtonBlock extends ButtonBlock {
	public HornbeamButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30, properties.ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}