
package com.pseudorygium.item;

public class OpenCoconutItem extends Item {
	public OpenCoconutItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.5f).build()));
	}
}