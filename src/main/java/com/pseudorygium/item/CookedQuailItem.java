
package com.pseudorygium.item;

public class CookedQuailItem extends Item {
	public CookedQuailItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6f).build()));
	}
}