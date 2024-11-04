
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ProboscisMonkeyEntity;
import com.pseudorygium.client.model.Modelproboscis_monkey;

public class ProboscisMonkeyRenderer extends MobRenderer<ProboscisMonkeyEntity, Modelproboscis_monkey<ProboscisMonkeyEntity>> {
	public ProboscisMonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelproboscis_monkey(context.bakeLayer(Modelproboscis_monkey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProboscisMonkeyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/proboscis_monkey.png");
	}
}
