package com.pseudorygium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import com.pseudorygium.init.PseudorygiumModBlocks;
import com.pseudorygium.PseudorygiumMod;

public class SuffocateInQuicksandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == PseudorygiumModBlocks.QUICKSAND.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == PseudorygiumModBlocks.QUICKSAND.get()) {
			PseudorygiumMod.queueServerWork(140, () -> {
				for (int index0 = 0; index0 < (int) Double.POSITIVE_INFINITY; index0++) {
					PseudorygiumMod.queueServerWork(20, () -> {
						entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("pseudorygium:quicksand_suffocate")))), 1);
					});
				}
			});
		}
	}
}
