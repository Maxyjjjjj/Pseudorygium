
package com.pseudorygium.item;

public class SunflowerSeedsItem extends Item {
	public SunflowerSeedsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.5f).build()));
	}
}