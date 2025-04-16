
package com.pseudorygium.item;

public class CookedVenisonItem extends Item {
	public CookedVenisonItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(1.7f).build()));
	}
}