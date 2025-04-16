
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SappyMapleLogBlock extends Block {
	public SappyMapleLogBlock(BlockBehaviour.Properties properties) {
		super(properties.ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(2f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}