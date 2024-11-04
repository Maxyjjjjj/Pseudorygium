
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LizardEntity;
import com.pseudorygium.client.model.Modellizard;

public class LizardRenderer extends MobRenderer<LizardEntity, Modellizard<LizardEntity>> {
	public LizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LizardEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lizard.png");
	}
}
