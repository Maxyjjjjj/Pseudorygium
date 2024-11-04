
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TanukiEntity;
import com.pseudorygium.client.model.Modeltanuki;

public class TanukiRenderer extends MobRenderer<TanukiEntity, Modeltanuki<TanukiEntity>> {
	public TanukiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltanuki(context.bakeLayer(Modeltanuki.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(TanukiEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tanuki.png");
	}
}
