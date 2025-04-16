
package com.pseudorygium.item;

public class RawSilverItem extends Item {
	public RawSilverItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}