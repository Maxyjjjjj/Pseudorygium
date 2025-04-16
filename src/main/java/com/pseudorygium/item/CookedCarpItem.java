
package com.pseudorygium.item;

public class CookedCarpItem extends Item {
	public CookedCarpItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.6f).build()));
	}
}