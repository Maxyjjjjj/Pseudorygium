
package com.pseudorygium.item;

public class CobaltShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 563, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_shovel_repair_items")));

	public CobaltShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, -2f, properties);
	}
}
