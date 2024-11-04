
package com.pseudorygium.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import com.pseudorygium.procedures.VenusFlytrapMobplayerCollidesWithPlantProcedure;

public class VenusFlytrapBlock extends FlowerBlock {
	public VenusFlytrapBlock() {
		super(MobEffects.MOVEMENT_SPEED, 100, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	private boolean canPlantTypeSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return state.is(BlockTags.DIRT) || state.getBlock() == Blocks.FARMLAND;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader world, BlockPos pos) {
		BlockPos posbelow = pos.below();
		BlockState statebelow = world.getBlockState(posbelow);
		if (blockstate.getBlock() == this)
			return this.canPlantTypeSurvive(statebelow, world, posbelow);
		return this.mayPlaceOn(statebelow, world, posbelow);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VenusFlytrapMobplayerCollidesWithPlantProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
