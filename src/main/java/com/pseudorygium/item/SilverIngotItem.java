
package com.pseudorygium.item;

public class SilverIngotItem extends Item {
	public SilverIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}