
package com.pseudorygium.item;

public class MaizeItem extends Item {
	public MaizeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.5f).build()));
	}
}