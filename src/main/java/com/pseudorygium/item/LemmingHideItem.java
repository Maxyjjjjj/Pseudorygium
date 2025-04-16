
package com.pseudorygium.item;

public class LemmingHideItem extends Item {
	public LemmingHideItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}