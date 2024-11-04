
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HornbillEntity;
import com.pseudorygium.client.model.Modelhornbill;

public class HornbillRenderer extends MobRenderer<HornbillEntity, Modelhornbill<HornbillEntity>> {
	public HornbillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhornbill(context.bakeLayer(Modelhornbill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HornbillEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hornbill.png");
	}
}
