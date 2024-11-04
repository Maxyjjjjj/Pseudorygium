
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SealEntity;
import com.pseudorygium.client.model.Modelseal;

public class SealRenderer extends MobRenderer<SealEntity, Modelseal<SealEntity>> {
	public SealRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseal(context.bakeLayer(Modelseal.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SealEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seal_temperate.png");
	}
}
