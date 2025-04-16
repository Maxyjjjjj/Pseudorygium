
package com.pseudorygium.item;

public class NetheriteKatanaItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 4f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:netherite_katana_repair_items")));

	public NetheriteKatanaItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 10f, -1f, properties.fireResistant());
	}
}
