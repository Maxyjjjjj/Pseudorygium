
package com.pseudorygium.item;

public class SilverNuggetItem extends Item {
	public SilverNuggetItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}