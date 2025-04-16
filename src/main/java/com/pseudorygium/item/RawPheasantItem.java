
package com.pseudorygium.item;

public class RawPheasantItem extends Item {
	public RawPheasantItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1f).build()));
	}
}