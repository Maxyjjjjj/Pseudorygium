
package com.pseudorygium.item;

public class QuicksandBucketItem extends Item {
	public QuicksandBucketItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		QuicksandBucketRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}