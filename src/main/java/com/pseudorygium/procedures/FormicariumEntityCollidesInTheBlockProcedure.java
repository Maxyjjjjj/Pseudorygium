package com.pseudorygium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModEntities;
import com.pseudorygium.init.PseudorygiumModBlocks;
import com.pseudorygium.entity.AntEntity;
import com.pseudorygium.PseudorygiumMod;

public class FormicariumEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == PseudorygiumModBlocks.FORMICARIUM.get() && entity instanceof AntEntity) {
			if (!entity.level().isClientSide())
				entity.discard();
			PseudorygiumMod.queueServerWork(2000, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = PseudorygiumModEntities.ANT.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
			});
		}
	}
}
