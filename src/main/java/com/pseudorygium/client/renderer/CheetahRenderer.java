
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CheetahEntity;
import com.pseudorygium.client.model.Modelcheetah;

public class CheetahRenderer extends MobRenderer<CheetahEntity, Modelcheetah<CheetahEntity>> {
	public CheetahRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcheetah(context.bakeLayer(Modelcheetah.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(CheetahEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cheetah.png");
	}
}
