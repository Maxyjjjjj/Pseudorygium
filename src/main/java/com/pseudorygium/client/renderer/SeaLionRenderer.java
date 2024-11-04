
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeaLionEntity;
import com.pseudorygium.client.model.Modelsea_lion;

public class SeaLionRenderer extends MobRenderer<SeaLionEntity, Modelsea_lion<SeaLionEntity>> {
	public SeaLionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_lion(context.bakeLayer(Modelsea_lion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeaLionEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_lion.png");
	}
}
