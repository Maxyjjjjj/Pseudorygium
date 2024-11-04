
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.pseudorygium.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.pseudorygium.PseudorygiumMod;

public class PseudorygiumModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, PseudorygiumMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_ZEBRA_AMBIENT = REGISTRY.register("entity.zebra.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.zebra.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_DEER_AMIBENT = REGISTRY.register("entity.deer.amibent", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.deer.amibent")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_DEER_HURT = REGISTRY.register("entity.deer.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.deer.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_DEER_DEATH = REGISTRY.register("entity.deer.death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.deer.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_ELEPHANT_AMBIENT = REGISTRY.register("entity.elephant.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.elephant.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_ELEPHANT_HURT = REGISTRY.register("entity.elephant.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.elephant.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_ELEPHANT_DEATH = REGISTRY.register("entity.elephant.death",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.elephant.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_TIGER_HURT = REGISTRY.register("entity.tiger.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.tiger.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_LION_DEATH = REGISTRY.register("entity.lion.death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.lion.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CHIMPANZEE_AMBIENT = REGISTRY.register("entity.chimpanzee.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.chimpanzee.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CHIMPANZEE_STEP = REGISTRY.register("entity.chimpanzee.step",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.chimpanzee.step")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CHIMPANZEE_HURT = REGISTRY.register("entity.chimpanzee.hurt",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.chimpanzee.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CHIMPANZEE_DEATH = REGISTRY.register("entity.chimpanzee.death",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.chimpanzee.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPYBARA_AMBIENT = REGISTRY.register("entity.capybara.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capybara.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPYBARA_HURT = REGISTRY.register("entity.capybara.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capybara.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPYBARA_DEATH = REGISTRY.register("entity.capybara.death",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capybara.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_OSTRICH_AMBIENT = REGISTRY.register("entity.ostrich.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.ostrich.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_OSTRICH_HURT = REGISTRY.register("entity.ostrich.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.ostrich.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_RACOON_AMBIENT = REGISTRY.register("entity.racoon.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.racoon.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_HIPPOPOTAMUS_AMBIENT = REGISTRY.register("entity.hippopotamus.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.hippopotamus.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_OWL_AMBIENT = REGISTRY.register("entity.owl.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.owl.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPERCAILLIE_AMBIENT = REGISTRY.register("entity.capercaillie.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capercaillie.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPERCAILLIE_HURT = REGISTRY.register("entity.capercaillie.hurt",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capercaillie.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_CAPERCAILLIE_DEATH = REGISTRY.register("entity.capercaillie.death",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.capercaillie.death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_MORIN_KHUUR_JUKEBOX = REGISTRY.register("item.morin_khuur.jukebox",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "item.morin_khuur.jukebox")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITEM_MORIN_KHUUR_PLAY = REGISTRY.register("item.morin_khuur.play",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "item.morin_khuur.play")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_SNOW_LEOPARD_AMBIENT = REGISTRY.register("entity.snow_leopard.ambient",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.snow_leopard.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_TIGER_AMBIENT = REGISTRY.register("entity.tiger.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.tiger.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_LION_AMBIENT = REGISTRY.register("entity.lion.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.lion.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_LION_HURT = REGISTRY.register("entity.lion.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.lion.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_SNOW_LEOPARD_HURT = REGISTRY.register("entity.snow_leopard.hurt",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pseudorygium", "entity.snow_leopard.hurt")));
}
