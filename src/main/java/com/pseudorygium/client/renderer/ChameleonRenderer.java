
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChameleonEntity;
import com.pseudorygium.client.model.Modelchameleon;

public class ChameleonRenderer extends MobRenderer<ChameleonEntity, Modelchameleon<ChameleonEntity>> {
	public ChameleonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchameleon(context.bakeLayer(Modelchameleon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChameleonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chameleon.png");
	}
}
