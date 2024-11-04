
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PigeonEntity;
import com.pseudorygium.client.model.Modelpigeon;

public class PigeonRenderer extends MobRenderer<PigeonEntity, Modelpigeon<PigeonEntity>> {
	public PigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpigeon(context.bakeLayer(Modelpigeon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PigeonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pigeon.png");
	}
}
