
package com.pseudorygium.item;

import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class LeafCrownItem extends ArmorItem {

	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(25, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 9,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("block.grass.place")), 0f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:leaf_crown_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("pseudorygium:leaf_crown")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				ModelPart head = new Modelleafcrown(Minecraft.getInstance().getEntityModels().bakeLayer(Modelleafcrown.LAYER_LOCATION)).crown;
				head.setInitialPose(PartPose.rotation(0, (float) (Math.PI), 0));
				head.resetPose();
				return new HumanoidModel(new ModelPart(Collections.emptyList(),
						Map.of("head", new ModelPart(Collections.emptyList(), Map.of("head", head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
								new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("pseudorygium:textures/entities/leafcrown.png");
			}
		}, PseudorygiumModItems.LEAF_CROWN_HELMET.get());

	}

	private LeafCrownItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends LeafCrownItem {

		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

}
