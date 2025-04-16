
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RawSilverBlockBlock extends Block {
	public RawSilverBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}