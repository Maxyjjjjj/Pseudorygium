
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SnakeEntity;
import com.pseudorygium.client.model.Modelsnake;

public class SnakeRenderer extends MobRenderer<SnakeEntity, Modelsnake<SnakeEntity>> {
	public SnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnake(context.bakeLayer(Modelsnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnakeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snake_regular.png");
	}
}
