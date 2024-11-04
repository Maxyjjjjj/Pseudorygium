
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PallasCatEntity;
import com.pseudorygium.client.model.Modelpallas_cat;

public class PallasCatRenderer extends MobRenderer<PallasCatEntity, Modelpallas_cat<PallasCatEntity>> {
	public PallasCatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpallas_cat(context.bakeLayer(Modelpallas_cat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PallasCatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/allasat.png");
	}
}
