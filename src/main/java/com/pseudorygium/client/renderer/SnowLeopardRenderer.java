
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SnowLeopardEntity;
import com.pseudorygium.client.model.Modelsnow_leopard;

public class SnowLeopardRenderer extends MobRenderer<SnowLeopardEntity, Modelsnow_leopard<SnowLeopardEntity>> {
	public SnowLeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnow_leopard(context.bakeLayer(Modelsnow_leopard.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowLeopardEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snow_leopard.png");
	}
}
