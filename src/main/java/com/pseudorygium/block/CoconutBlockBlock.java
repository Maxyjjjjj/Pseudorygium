
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CoconutBlockBlock extends FallingBlock {
	public static final MapCodec<CoconutBlockBlock> CODEC = simpleCodec(CoconutBlockBlock::new);

	public MapCodec<CoconutBlockBlock> codec() {
		return CODEC;
	}

	public CoconutBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.WOOD).strength(1.4f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return box(4, 0, 4, 12, 8, 12);
	}
}