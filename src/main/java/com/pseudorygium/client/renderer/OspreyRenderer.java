
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OspreyEntity;
import com.pseudorygium.client.model.Modelosprey;

public class OspreyRenderer extends MobRenderer<OspreyEntity, Modelosprey<OspreyEntity>> {
	public OspreyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelosprey(context.bakeLayer(Modelosprey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OspreyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/osprey.png");
	}
}
