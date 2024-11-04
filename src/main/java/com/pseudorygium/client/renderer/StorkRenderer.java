
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.StorkEntity;
import com.pseudorygium.client.model.Modelstork;

public class StorkRenderer extends MobRenderer<StorkEntity, Modelstork<StorkEntity>> {
	public StorkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstork(context.bakeLayer(Modelstork.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StorkEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/stork_white.png");
	}
}
