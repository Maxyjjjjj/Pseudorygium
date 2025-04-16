
package com.pseudorygium.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class VenusFlytrapBlock extends FlowerBlock {
	public VenusFlytrapBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.MOVEMENT_SPEED, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VenusFlytrapMobplayerCollidesWithPlantProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}