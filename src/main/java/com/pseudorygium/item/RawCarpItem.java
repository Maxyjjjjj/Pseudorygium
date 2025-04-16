
package com.pseudorygium.item;

public class RawCarpItem extends Item {
	public RawCarpItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}
}