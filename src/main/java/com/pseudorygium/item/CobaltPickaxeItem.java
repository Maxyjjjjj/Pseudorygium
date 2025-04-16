
package com.pseudorygium.item;

public class CobaltPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 563, 8f, 0, 21, TagKey.create(Registries.ITEM, ResourceLocation.parse("pseudorygium:cobalt_pickaxe_repair_items")));

	public CobaltPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, -2f, properties);
	}
}
