
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PeafowlEntity;
import com.pseudorygium.client.model.Modelpeafowl;

public class PeafowlRenderer extends MobRenderer<PeafowlEntity, Modelpeafowl<PeafowlEntity>> {
	public PeafowlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpeafowl(context.bakeLayer(Modelpeafowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PeafowlEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/peafowl.png");
	}
}
