
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GrassSnakeEntity;
import com.pseudorygium.client.model.Modelsnake;

public class GrassSnakeRenderer extends MobRenderer<GrassSnakeEntity, Modelsnake<GrassSnakeEntity>> {
	public GrassSnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnake(context.bakeLayer(Modelsnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrassSnakeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snake_grass.png");
	}
}
