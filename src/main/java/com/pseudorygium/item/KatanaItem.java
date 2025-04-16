
package com.pseudorygium.item;

public class KatanaItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 720, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:katana_repair_items")));

	public KatanaItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 3f, -3f, properties.fireResistant());
	}
}
