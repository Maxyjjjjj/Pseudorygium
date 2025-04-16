
package com.pseudorygium.item;

public class LeafItem extends Item {
	public LeafItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}