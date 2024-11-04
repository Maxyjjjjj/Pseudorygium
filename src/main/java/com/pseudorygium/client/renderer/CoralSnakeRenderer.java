
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CoralSnakeEntity;
import com.pseudorygium.client.model.Modelsnake;

public class CoralSnakeRenderer extends MobRenderer<CoralSnakeEntity, Modelsnake<CoralSnakeEntity>> {
	public CoralSnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnake(context.bakeLayer(Modelsnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CoralSnakeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snake_coral.png");
	}
}
