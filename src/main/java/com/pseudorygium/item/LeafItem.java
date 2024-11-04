
package com.pseudorygium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LeafItem extends Item {
	public LeafItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
