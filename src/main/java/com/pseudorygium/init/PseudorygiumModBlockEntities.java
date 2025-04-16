
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pseudorygium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import com.pseudorygium.block.entity.FormicariumBlockEntity;
import com.pseudorygium.block.entity.AnthillBlockEntity;
import com.pseudorygium.PseudorygiumMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PseudorygiumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, PseudorygiumMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ANTHILL = register("anthill", PseudorygiumModBlocks.ANTHILL, AnthillBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FORMICARIUM = register("formicarium", PseudorygiumModBlocks.FORMICARIUM, FormicariumBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANTHILL.get(), (blockEntity, side) -> ((AnthillBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FORMICARIUM.get(), (blockEntity, side) -> ((FormicariumBlockEntity) blockEntity).getItemHandler());
	}
}
