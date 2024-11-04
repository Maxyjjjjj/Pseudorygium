
package com.pseudorygium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PeatItem extends Item {
	public PeatItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
