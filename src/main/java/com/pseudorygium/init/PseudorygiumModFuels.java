
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.pseudorygium.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class PseudorygiumModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == PseudorygiumModBlocks.PEAT_BLOCK.get().asItem())
			event.setBurnTime(16000);
		else if (itemstack.getItem() == PseudorygiumModItems.PEAT.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == PseudorygiumModItems.LEAF.get())
			event.setBurnTime(100);
	}
}
