package com.pseudorygium.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModBlocks;
import com.pseudorygium.entity.RatEntity;
import com.pseudorygium.entity.MouseEntity;
import com.pseudorygium.entity.MantisEntity;
import com.pseudorygium.entity.LadybugEntity;
import com.pseudorygium.entity.JumpingSpiderEntity;
import com.pseudorygium.entity.HummingbirdEntity;
import com.pseudorygium.entity.EarthwormEntityEntity;
import com.pseudorygium.entity.CaterpillarEntity;
import com.pseudorygium.entity.ButterflyEntity;
import com.pseudorygium.entity.AphidEntity;
import com.pseudorygium.entity.AntEntity;
import com.pseudorygium.PseudorygiumMod;

public class VenusFlytrapMobplayerCollidesWithPlantProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PseudorygiumModBlocks.VENUS_FLYTRAP.get() && (entity instanceof CaveSpider || entity instanceof Spider || entity instanceof Silverfish || entity instanceof MantisEntity
				|| entity instanceof Endermite || entity instanceof Bat || entity instanceof AphidEntity || entity instanceof ButterflyEntity || entity instanceof AntEntity || entity instanceof CaterpillarEntity || entity instanceof MouseEntity
				|| entity instanceof JumpingSpiderEntity || entity instanceof LadybugEntity || entity instanceof Bee || entity instanceof RatEntity || entity instanceof HummingbirdEntity || entity instanceof EarthwormEntityEntity)) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.SWEET_BERRY_BUSH)), 100);
			PseudorygiumMod.queueServerWork(20, () -> {
				world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(PseudorygiumModBlocks.VENUS_FLYTRAP.get().defaultBlockState()));
			});
		}
	}
}
