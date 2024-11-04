
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package com.pseudorygium.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class PseudorygiumModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PseudorygiumModItems.SILVER_INGOT.get(), 2), new ItemStack(Items.EMERALD, 3), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(PseudorygiumModItems.KATANA.get()), 10, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(PseudorygiumModItems.RAW_CARP.get(), 6), new ItemStack(PseudorygiumModItems.COOKED_CARP.get()), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(PseudorygiumModItems.RAW_CARP.get(), 11), new ItemStack(Items.EMERALD), 16, 5, 0.05f));
		}
	}
}
