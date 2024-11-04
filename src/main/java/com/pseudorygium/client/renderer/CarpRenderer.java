
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CarpEntity;
import com.pseudorygium.client.model.Modelcarp;

public class CarpRenderer extends MobRenderer<CarpEntity, Modelcarp<CarpEntity>> {
	public CarpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcarp(context.bakeLayer(Modelcarp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarpEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/carp.png");
	}
}
