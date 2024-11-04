
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PumaEntity;
import com.pseudorygium.client.model.Modelpuma;

public class PumaRenderer extends MobRenderer<PumaEntity, Modelpuma<PumaEntity>> {
	public PumaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuma(context.bakeLayer(Modelpuma.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PumaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/puma.png");
	}
}
