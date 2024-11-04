
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OctopusEntity;
import com.pseudorygium.client.model.Modeloctopus;

public class OctopusRenderer extends MobRenderer<OctopusEntity, Modeloctopus<OctopusEntity>> {
	public OctopusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloctopus(context.bakeLayer(Modeloctopus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OctopusEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/octopus.png");
	}
}
