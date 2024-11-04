
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CardinalEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class CardinalRenderer extends MobRenderer<CardinalEntity, Modelpasserine<CardinalEntity>> {
	public CardinalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CardinalEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cardinal.png");
	}
}
