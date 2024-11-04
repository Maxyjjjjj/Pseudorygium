
package com.pseudorygium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarpBucketItem extends Item {
	public CarpBucketItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
