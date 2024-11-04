
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TapirEntity;
import com.pseudorygium.client.model.Modeltapir;

public class TapirRenderer extends MobRenderer<TapirEntity, Modeltapir<TapirEntity>> {
	public TapirRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltapir(context.bakeLayer(Modeltapir.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TapirEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tapir.png");
	}
}
