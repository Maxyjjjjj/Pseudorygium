
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HoneyBadgerEntity;
import com.pseudorygium.client.model.Modelhoney_badger;

public class HoneyBadgerRenderer extends MobRenderer<HoneyBadgerEntity, Modelhoney_badger<HoneyBadgerEntity>> {
	public HoneyBadgerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoney_badger(context.bakeLayer(Modelhoney_badger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoneyBadgerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/honey_badger.png");
	}
}
