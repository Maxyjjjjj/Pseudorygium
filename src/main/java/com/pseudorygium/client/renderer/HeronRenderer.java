
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HeronEntity;
import com.pseudorygium.client.model.Modelheron;

public class HeronRenderer extends MobRenderer<HeronEntity, Modelheron<HeronEntity>> {
	public HeronRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelheron(context.bakeLayer(Modelheron.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HeronEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/heron.png");
	}
}
