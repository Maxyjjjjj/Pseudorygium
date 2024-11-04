
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BadgerEntity;
import com.pseudorygium.client.model.Modelbadger;

public class BadgerRenderer extends MobRenderer<BadgerEntity, Modelbadger<BadgerEntity>> {
	public BadgerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbadger(context.bakeLayer(Modelbadger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BadgerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/badger.png");
	}
}
