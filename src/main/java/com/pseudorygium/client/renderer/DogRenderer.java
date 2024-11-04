
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DogEntity;
import com.pseudorygium.client.model.Modeldog;

public class DogRenderer extends MobRenderer<DogEntity, Modeldog<DogEntity>> {
	public DogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldog(context.bakeLayer(Modeldog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DogEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dog.png");
	}
}
