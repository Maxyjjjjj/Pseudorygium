
package com.pseudorygium.item;

public class SapBottleItem extends Item {
	public SapBottleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.DRINK;
	}
}