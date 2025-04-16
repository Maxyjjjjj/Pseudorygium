
package com.pseudorygium.item;

public class CobaltHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 563, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_hoe_repair_items")));

	public CobaltHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, 1f, properties);
	}
}
