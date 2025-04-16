
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class EucalyptusTrapdoorBlock extends TrapDoorBlock {
	public EucalyptusTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}