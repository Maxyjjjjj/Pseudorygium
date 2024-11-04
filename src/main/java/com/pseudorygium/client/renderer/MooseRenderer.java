
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MooseEntity;
import com.pseudorygium.client.model.Modelmoose;

public class MooseRenderer extends MobRenderer<MooseEntity, Modelmoose<MooseEntity>> {
	public MooseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoose(context.bakeLayer(Modelmoose.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(MooseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/moose.png");
	}
}
