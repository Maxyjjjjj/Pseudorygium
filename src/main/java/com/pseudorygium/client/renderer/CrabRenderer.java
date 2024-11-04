
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CrabEntity;
import com.pseudorygium.client.model.Modelcrab;

public class CrabRenderer extends MobRenderer<CrabEntity, Modelcrab<CrabEntity>> {
	public CrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrabEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crab.png");
	}
}
