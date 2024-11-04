
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MandarinDuckEntity;
import com.pseudorygium.client.model.Modelmandarin_duck;

public class MandarinDuckRenderer extends MobRenderer<MandarinDuckEntity, Modelmandarin_duck<MandarinDuckEntity>> {
	public MandarinDuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmandarin_duck(context.bakeLayer(Modelmandarin_duck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MandarinDuckEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mandarin_duck.png");
	}
}
