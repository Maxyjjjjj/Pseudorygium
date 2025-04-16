
package com.pseudorygium.item;

import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class CobaltArmorItem extends ArmorItem {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(23, Map.of(ArmorType.BOOTS, 3, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 7, ArmorType.HELMET, 3, ArmorType.BODY, 7), 14,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_diamond")), 1f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("pseudorygium:cobalt_armor")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("pseudorygium:textures/models/armor/cobalt__layer_1.png");
			}
		}, PseudorygiumModItems.COBALT_ARMOR_HELMET.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("pseudorygium:textures/models/armor/cobalt__layer_1.png");
			}
		}, PseudorygiumModItems.COBALT_ARMOR_CHESTPLATE.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("pseudorygium:textures/models/armor/cobalt__layer_2.png");
			}
		}, PseudorygiumModItems.COBALT_ARMOR_LEGGINGS.get());

		event.registerItem(new IClientItemExtensions() {

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("pseudorygium:textures/models/armor/cobalt__layer_1.png");
			}
		}, PseudorygiumModItems.COBALT_ARMOR_BOOTS.get());
	}

	private CobaltArmorItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends CobaltArmorItem {

		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}

	}

	public static class Chestplate extends CobaltArmorItem {

		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}

	}

	public static class Leggings extends CobaltArmorItem {

		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}

	}

	public static class Boots extends CobaltArmorItem {

		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}

	}

}
