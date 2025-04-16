
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HornbeamStairsBlock extends StairBlock {
	public HornbeamStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(3f, 2f));
	}

	@Override
	public float getExplosionResistance() {
		return 2f;
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