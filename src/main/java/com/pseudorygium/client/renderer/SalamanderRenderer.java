
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SalamanderEntity;
import com.pseudorygium.client.model.Modelsalamander;

public class SalamanderRenderer extends MobRenderer<SalamanderEntity, Modelsalamander<SalamanderEntity>> {
	public SalamanderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsalamander(context.bakeLayer(Modelsalamander.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SalamanderEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/salamander.png");
	}
}
