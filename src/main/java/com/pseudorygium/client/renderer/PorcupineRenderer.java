
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PorcupineEntity;
import com.pseudorygium.client.model.Modelporcupine;

public class PorcupineRenderer extends MobRenderer<PorcupineEntity, Modelporcupine<PorcupineEntity>> {
	public PorcupineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelporcupine(context.bakeLayer(Modelporcupine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PorcupineEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/porcupine.png");
	}
}
