
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HamsterEntity;
import com.pseudorygium.client.model.Modelhamster;

public class HamsterRenderer extends MobRenderer<HamsterEntity, Modelhamster<HamsterEntity>> {
	public HamsterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhamster(context.bakeLayer(Modelhamster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HamsterEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hamster.png");
	}
}
