
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HamadryasBaboonEntity;
import com.pseudorygium.client.model.Modelbaboon;

public class HamadryasBaboonRenderer extends MobRenderer<HamadryasBaboonEntity, Modelbaboon<HamadryasBaboonEntity>> {
	public HamadryasBaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaboon(context.bakeLayer(Modelbaboon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HamadryasBaboonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hamadryas_baboon.png");
	}
}
