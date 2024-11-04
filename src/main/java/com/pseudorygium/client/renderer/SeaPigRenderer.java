
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeaPigEntity;
import com.pseudorygium.client.model.Modelsea_pig;

public class SeaPigRenderer extends MobRenderer<SeaPigEntity, Modelsea_pig<SeaPigEntity>> {
	public SeaPigRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_pig(context.bakeLayer(Modelsea_pig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeaPigEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_pig.png");
	}
}
