
package com.pseudorygium.item;

public class CobaltSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 563, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_sword_repair_items")));

	public CobaltSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -2f, properties);
	}
}
