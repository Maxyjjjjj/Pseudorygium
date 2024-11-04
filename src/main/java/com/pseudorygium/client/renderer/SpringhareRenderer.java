
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SpringhareEntity;
import com.pseudorygium.client.model.Modelspringhare;

public class SpringhareRenderer extends MobRenderer<SpringhareEntity, Modelspringhare<SpringhareEntity>> {
	public SpringhareRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspringhare(context.bakeLayer(Modelspringhare.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpringhareEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/spinghare.png");
	}
}
