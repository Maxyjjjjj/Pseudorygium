
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BuffaloEntity;
import com.pseudorygium.client.model.Modelbuffalo;

public class BuffaloRenderer extends MobRenderer<BuffaloEntity, Modelbuffalo<BuffaloEntity>> {
	public BuffaloRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbuffalo(context.bakeLayer(Modelbuffalo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuffaloEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/buffalo.png");
	}
}
