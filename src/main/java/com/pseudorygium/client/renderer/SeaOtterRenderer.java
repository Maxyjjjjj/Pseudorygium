
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeaOtterEntity;
import com.pseudorygium.client.model.Modelsea_otter;

public class SeaOtterRenderer extends MobRenderer<SeaOtterEntity, Modelsea_otter<SeaOtterEntity>> {
	public SeaOtterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_otter(context.bakeLayer(Modelsea_otter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeaOtterEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_otter.png");
	}
}
