
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PrzevalskiHorseEntity;
import com.pseudorygium.client.model.Modelprzevalski_horse;

public class PrzevalskiHorseRenderer extends MobRenderer<PrzevalskiHorseEntity, Modelprzevalski_horse<PrzevalskiHorseEntity>> {
	public PrzevalskiHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprzevalski_horse(context.bakeLayer(Modelprzevalski_horse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrzevalskiHorseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/przevalski_horse.png");
	}
}
