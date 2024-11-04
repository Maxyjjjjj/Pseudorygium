
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.QuollEntity;
import com.pseudorygium.client.model.Modelquoll;

public class QuollRenderer extends MobRenderer<QuollEntity, Modelquoll<QuollEntity>> {
	public QuollRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquoll(context.bakeLayer(Modelquoll.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(QuollEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/quoll.png");
	}
}
