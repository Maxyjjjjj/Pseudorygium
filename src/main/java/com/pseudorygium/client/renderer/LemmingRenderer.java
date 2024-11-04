
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LemmingEntity;
import com.pseudorygium.client.model.Modellemming;

public class LemmingRenderer extends MobRenderer<LemmingEntity, Modellemming<LemmingEntity>> {
	public LemmingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellemming(context.bakeLayer(Modellemming.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LemmingEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lemming.png");
	}
}
