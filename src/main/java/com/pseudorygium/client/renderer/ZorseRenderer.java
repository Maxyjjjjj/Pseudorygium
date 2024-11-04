
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ZorseEntity;
import com.pseudorygium.client.model.Modelzebroid;

public class ZorseRenderer extends MobRenderer<ZorseEntity, Modelzebroid<ZorseEntity>> {
	public ZorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebroid(context.bakeLayer(Modelzebroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZorseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/zorse.png");
	}
}
