
package com.pseudorygium.item;

public class CookedChevonItem extends Item {
	public CookedChevonItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.8f).build()));
	}
}