
package com.pseudorygium.item;

public class StrawberryItem extends Item {
	public StrawberryItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).alwaysEdible().build()));
	}
}