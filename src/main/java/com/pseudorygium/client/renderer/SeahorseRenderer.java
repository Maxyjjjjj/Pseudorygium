
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeahorseEntity;
import com.pseudorygium.client.model.Modelseahorse;

public class SeahorseRenderer extends MobRenderer<SeahorseEntity, Modelseahorse<SeahorseEntity>> {
	public SeahorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseahorse(context.bakeLayer(Modelseahorse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeahorseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seahorse_yellow.png");
	}
}
