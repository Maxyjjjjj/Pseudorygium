
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GoldfinchEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class GoldfinchRenderer extends MobRenderer<GoldfinchEntity, Modelpasserine<GoldfinchEntity>> {
	public GoldfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoldfinchEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/goldfinch.png");
	}
}
