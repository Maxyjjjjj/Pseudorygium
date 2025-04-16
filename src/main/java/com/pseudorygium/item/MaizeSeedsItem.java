
package com.pseudorygium.item;

public class MaizeSeedsItem extends Item {
	public MaizeSeedsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}