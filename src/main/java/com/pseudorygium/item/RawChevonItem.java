
package com.pseudorygium.item;

public class RawChevonItem extends Item {
	public RawChevonItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}