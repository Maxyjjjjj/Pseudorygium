
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FerretEntity;
import com.pseudorygium.client.model.Modelferret;

public class FerretRenderer extends MobRenderer<FerretEntity, Modelferret<FerretEntity>> {
	public FerretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelferret(context.bakeLayer(Modelferret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FerretEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ferret.png");
	}
}
