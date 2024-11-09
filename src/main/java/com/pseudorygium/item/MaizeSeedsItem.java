
package com.pseudorygium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MaizeSeedsItem extends Item {
	public MaizeSeedsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
