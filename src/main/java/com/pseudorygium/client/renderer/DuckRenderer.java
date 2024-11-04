
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DuckEntity;
import com.pseudorygium.client.model.Modelduck;

public class DuckRenderer extends MobRenderer<DuckEntity, Modelduck<DuckEntity>> {
	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck(context.bakeLayer(Modelduck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuckEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mallard-duck-on-planetminecraft-com.png");
	}
}
