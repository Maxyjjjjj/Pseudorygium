
package com.pseudorygium.item;

public class CobaltIngotItem extends Item {
	public CobaltIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}