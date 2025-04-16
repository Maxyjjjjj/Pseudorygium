
package com.pseudorygium.item;

public class MapleSyrupBottleItem extends Item {
	public MapleSyrupBottleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.5f).build()));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.DRINK;
	}
}