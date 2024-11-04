
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MarabouEntity;
import com.pseudorygium.client.model.Modelmarabou_stork;

public class MarabouRenderer extends MobRenderer<MarabouEntity, Modelmarabou_stork<MarabouEntity>> {
	public MarabouRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarabou_stork(context.bakeLayer(Modelmarabou_stork.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarabouEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/maraboustork.png");
	}
}
