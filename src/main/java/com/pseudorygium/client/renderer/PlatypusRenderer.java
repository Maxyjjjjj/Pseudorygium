
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PlatypusEntity;
import com.pseudorygium.client.model.Modelplatypus;

public class PlatypusRenderer extends MobRenderer<PlatypusEntity, Modelplatypus<PlatypusEntity>> {
	public PlatypusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplatypus(context.bakeLayer(Modelplatypus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlatypusEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/platypus.png");
	}
}
