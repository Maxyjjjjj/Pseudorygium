
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RaccoonEntity;
import com.pseudorygium.client.model.Modelracoon;

public class RaccoonRenderer extends MobRenderer<RaccoonEntity, Modelracoon<RaccoonEntity>> {
	public RaccoonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelracoon(context.bakeLayer(Modelracoon.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaccoonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/racoon.png");
	}
}
