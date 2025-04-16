
package com.pseudorygium.item;

public class CobaltAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 441, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_axe_repair_items")));

	public CobaltAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, -3f, properties);
	}
}
