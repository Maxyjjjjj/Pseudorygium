
package com.pseudorygium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MaizeItem extends Item {
	public MaizeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.5f).build()));
	}
}
