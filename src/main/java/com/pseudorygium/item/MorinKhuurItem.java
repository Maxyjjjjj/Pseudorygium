
package com.pseudorygium.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import com.pseudorygium.procedures.MorinKhuurRightclickedProcedure;

public class MorinKhuurItem extends Item {
	public MorinKhuurItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getEnchantmentValue() {
		return 5;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 100;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		MorinKhuurRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), ar.getObject());
		return ar;
	}
}
