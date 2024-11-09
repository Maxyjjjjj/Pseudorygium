
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pseudorygium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.pseudorygium.PseudorygiumMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PseudorygiumModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PseudorygiumMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PSEUDORYGIUM_ANIMALS = REGISTRY.register("pseudorygium_animals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pseudorygium.pseudorygium_animals")).icon(() -> new ItemStack(PseudorygiumModItems.SAOLA_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PseudorygiumModItems.SAOLA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.ZEBRA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.ECHIDNA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BROWN_BEAR_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.HEDGEHOG_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.DEER_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SQUIRREL_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.GIRAFFE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.MAMMOTH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.PHEASANT_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.PLATYPUS_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.LION_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.TIGER_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BARRELEYE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.ELEPHANT_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CRANE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SNAKE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.STORK_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.WOODPECKER_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BUFFALO_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SITATUNGA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.FOSSA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CHAMOIS_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SNAIL_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SNOW_LEOPARD_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CHIMPANZEE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.AYE_AYE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CAPYBARA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SAIGA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.MONKEY_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.MANTIS_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.OSTRICH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SEAL_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.REINDEER_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.LEMMING_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.GAZELLE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CHEETAH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.HUMMINGBIRD_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SECRETARYBIRD_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.MOOSE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.RED_PANDA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.RACCOON_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SLOTH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BINTURONG_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BADGER_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.HERON_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CRAB_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.TORTOISE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.OKAPI_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.TANUKI_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.KANGAROO_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.GHARIAL_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.ORANGUTAN_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.LOPHORINA_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.AARDVARK_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.PANGOLIN_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BUTTERFLY_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.MAGPIE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.HIPPOPOTAMUS_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.TITMOUSE_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.SPARROW_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.ROBIN_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CHAFFINCH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.BULLFINCH_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.KIWI_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.JAY_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.RAVEN_SPAWN_EGG.get());
				tabData.accept(PseudorygiumModItems.CROW_SPAWN_EGG.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PSEUDORYGIUM_FOODSTUFFS = REGISTRY.register("pseudorygium_foodstuffs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pseudorygium.pseudorygium_foodstuffs")).icon(() -> new ItemStack(PseudorygiumModItems.RAW_VENISON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PseudorygiumModItems.TOMATO.get());
				tabData.accept(PseudorygiumModItems.MAIZE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(PseudorygiumModBlocks.HORNBEAM_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_HORMBEAM_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_HORNBEAM_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_WILLOW_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_WILLOW_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_LINDEN_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_LINDEN_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_POPLAR_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_POPLAR_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_BAOBAB_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_BAOBAB_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_MAPLE_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_MAPLE_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_BEECH_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_BEECH_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_PALM_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_PALM_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_ASPEN_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_ASPEN_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_GINKGO_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_GINKGO_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_PLANKS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_STAIRS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_SLAB.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_FENCE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_FENCE_GATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_BUTTON.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_EUCALYPTUS_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.STRIPPED_EUCALYPTUS_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_DOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_TRAPDOOR.get().asItem());
			tabData.accept(PseudorygiumModBlocks.SILVER_ORE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.SILVER_BLOCK.get().asItem());
			tabData.accept(PseudorygiumModBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.RAW_SILVER_BLOCK.get().asItem());
			tabData.accept(PseudorygiumModBlocks.COBALT_ORE.get().asItem());
			tabData.accept(PseudorygiumModBlocks.COBALT_BLOCK.get().asItem());
			tabData.accept(PseudorygiumModBlocks.DEEPSLATE_COBALT_ORE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {

			tabData.accept(PseudorygiumModBlocks.FORMICARIUM.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(PseudorygiumModItems.KATANA.get());
			tabData.accept(PseudorygiumModItems.NETHERITE_KATANA.get());
			tabData.accept(PseudorygiumModItems.COBALT_SWORD.get());
			tabData.accept(PseudorygiumModItems.COBALT_ARMOR_HELMET.get());
			tabData.accept(PseudorygiumModItems.COBALT_ARMOR_CHESTPLATE.get());
			tabData.accept(PseudorygiumModItems.COBALT_ARMOR_LEGGINGS.get());
			tabData.accept(PseudorygiumModItems.COBALT_ARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(PseudorygiumModItems.EARTHWORM.get());
			tabData.accept(PseudorygiumModItems.PEAT.get());
			tabData.accept(PseudorygiumModItems.LEMMING_HIDE.get());
			tabData.accept(PseudorygiumModItems.LEAF.get());
			tabData.accept(PseudorygiumModItems.PEARL.get());
			tabData.accept(PseudorygiumModItems.SILVER_INGOT.get());
			tabData.accept(PseudorygiumModItems.RAW_SILVER.get());
			tabData.accept(PseudorygiumModItems.COBALT_INGOT.get());
			tabData.accept(PseudorygiumModItems.SILVER_NUGGET.get());
			tabData.accept(PseudorygiumModItems.TOMATO_SEEDS.get());
			tabData.accept(PseudorygiumModItems.MAIZE_SEEDS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(PseudorygiumModBlocks.HORNBEAM_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.HORNBEAM_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PERMAFROST.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LINDEN_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PEAT_BLOCK.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.WILLOW_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.VENUS_FLYTRAP.get().asItem());
			tabData.accept(PseudorygiumModBlocks.OUTBACK_BUSH.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.POPLAR_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.COLD_DESERT_GRASS.get().asItem());
			tabData.accept(PseudorygiumModBlocks.CAMELTHORN.get().asItem());
			tabData.accept(PseudorygiumModBlocks.COLD_DESERT_DIRT.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BAOBAB_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ANTHILL.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.MAPLE_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.SAPPY_MAPLE_LOG.get().asItem());
			tabData.accept(PseudorygiumModBlocks.SAPPY_MAPLE_WOOD.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.PALM_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.BEECH_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.ASPEN_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.GINKGO_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_LEAVES.get().asItem());
			tabData.accept(PseudorygiumModBlocks.EUCALYPTUS_SAPLING.get().asItem());
			tabData.accept(PseudorygiumModBlocks.REGULAR_BUSH.get().asItem());
			tabData.accept(PseudorygiumModBlocks.LAVENDER.get().asItem());
			tabData.accept(PseudorygiumModBlocks.DAFFODIL.get().asItem());
			tabData.accept(PseudorygiumModItems.QUICKSAND_BUCKET.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(PseudorygiumModItems.RAW_VENISON.get());
			tabData.accept(PseudorygiumModItems.COOKED_VENISON.get());
			tabData.accept(PseudorygiumModItems.ORANGE.get());
			tabData.accept(PseudorygiumModItems.BANANA.get());
			tabData.accept(PseudorygiumModItems.HAZELNUT.get());
			tabData.accept(PseudorygiumModItems.RAW_PHEASANT.get());
			tabData.accept(PseudorygiumModItems.COOKED_PHEASANT.get());
			tabData.accept(PseudorygiumModItems.RAW_CHEVON.get());
			tabData.accept(PseudorygiumModItems.COOKED_CHEVON.get());
			tabData.accept(PseudorygiumModItems.LARD.get());
			tabData.accept(PseudorygiumModItems.SUNFLOWER_SEEDS.get());
			tabData.accept(PseudorygiumModItems.RAW_TURKEY.get());
			tabData.accept(PseudorygiumModItems.COOKED_TURKEY.get());
			tabData.accept(PseudorygiumModItems.RAW_QUAIL.get());
			tabData.accept(PseudorygiumModItems.COOKED_QUAIL.get());
			tabData.accept(PseudorygiumModItems.SAP_BOTTLE.get());
			tabData.accept(PseudorygiumModItems.MAPLE_SYRUP_BOTTLE.get());
			tabData.accept(PseudorygiumModItems.STRAWBERRY.get());
			tabData.accept(PseudorygiumModItems.OPEN_COCONUT.get());
			tabData.accept(PseudorygiumModBlocks.COCONUT_BLOCK.get().asItem());
			tabData.accept(PseudorygiumModItems.RAW_CARP.get());
			tabData.accept(PseudorygiumModItems.COOKED_CARP.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(PseudorygiumModItems.CRAB_CLAW.get());
			tabData.accept(PseudorygiumModItems.LEAF_CROWN_HELMET.get());
			tabData.accept(PseudorygiumModItems.CARP_BUCKET.get());
			tabData.accept(PseudorygiumModItems.COBALT_PICKAXE.get());
			tabData.accept(PseudorygiumModItems.COBALT_AXE.get());
			tabData.accept(PseudorygiumModItems.COBALT_SHOVEL.get());
			tabData.accept(PseudorygiumModItems.COBALT_HOE.get());
			tabData.accept(PseudorygiumModItems.QUICKSAND_BUCKET.get());
			tabData.accept(PseudorygiumModItems.MORIN_KHUUR.get());

		}
	}
}
