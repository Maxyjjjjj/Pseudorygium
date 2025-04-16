
package com.pseudorygium.item;

public class CrabClawItem extends ShearsItem {
	public CrabClawItem(Item.Properties properties) {
		super(properties.durability(100).enchantable(2));
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 4f;
	}
}
