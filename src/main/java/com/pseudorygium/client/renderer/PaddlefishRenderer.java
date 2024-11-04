
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PaddlefishEntity;
import com.pseudorygium.client.model.Modelpaddlefish;

public class PaddlefishRenderer extends MobRenderer<PaddlefishEntity, Modelpaddlefish<PaddlefishEntity>> {
	public PaddlefishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpaddlefish(context.bakeLayer(Modelpaddlefish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PaddlefishEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/paddlefish.png");
	}
}
