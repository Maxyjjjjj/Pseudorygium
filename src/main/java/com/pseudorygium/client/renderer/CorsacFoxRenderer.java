
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CorsacFoxEntity;
import com.pseudorygium.client.model.Modelcorsac_fox;

public class CorsacFoxRenderer extends MobRenderer<CorsacFoxEntity, Modelcorsac_fox<CorsacFoxEntity>> {
	public CorsacFoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorsac_fox(context.bakeLayer(Modelcorsac_fox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorsacFoxEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fox10.png");
	}
}
