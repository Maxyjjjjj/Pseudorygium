
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GazelleEntity;
import com.pseudorygium.client.model.Modelgazelle;

public class GazelleRenderer extends MobRenderer<GazelleEntity, Modelgazelle<GazelleEntity>> {
	public GazelleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgazelle(context.bakeLayer(Modelgazelle.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GazelleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gazelle.png");
	}
}
