
package com.pseudorygium.item;

public class PeatItem extends Item {
	public PeatItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}