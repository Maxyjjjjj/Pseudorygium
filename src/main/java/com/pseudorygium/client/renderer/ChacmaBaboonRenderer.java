
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChacmaBaboonEntity;
import com.pseudorygium.client.model.Modelbaboon;

public class ChacmaBaboonRenderer extends MobRenderer<ChacmaBaboonEntity, Modelbaboon<ChacmaBaboonEntity>> {
	public ChacmaBaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaboon(context.bakeLayer(Modelbaboon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChacmaBaboonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chacma_baboon.png");
	}
}
