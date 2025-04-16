
package com.pseudorygium.item;

public class CarpBucketItem extends Item {
	public CarpBucketItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}