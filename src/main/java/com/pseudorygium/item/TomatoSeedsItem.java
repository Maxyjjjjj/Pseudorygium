
package com.pseudorygium.item;

public class TomatoSeedsItem extends Item {
	public TomatoSeedsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}