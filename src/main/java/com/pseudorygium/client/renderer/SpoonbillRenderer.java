
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SpoonbillEntity;
import com.pseudorygium.client.model.Modelspoonbill;

public class SpoonbillRenderer extends MobRenderer<SpoonbillEntity, Modelspoonbill<SpoonbillEntity>> {
	public SpoonbillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspoonbill(context.bakeLayer(Modelspoonbill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpoonbillEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/spoonbill.png");
	}
}
