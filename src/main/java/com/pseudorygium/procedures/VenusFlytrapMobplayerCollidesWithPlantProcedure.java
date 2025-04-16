package com.pseudorygium.procedures;

import net.neoforged.bus.api.Event;

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
