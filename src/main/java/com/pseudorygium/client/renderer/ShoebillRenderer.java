
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ShoebillEntity;
import com.pseudorygium.client.model.Modelshoebill;

public class ShoebillRenderer extends MobRenderer<ShoebillEntity, Modelshoebill<ShoebillEntity>> {
	public ShoebillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshoebill(context.bakeLayer(Modelshoebill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShoebillEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/shoebill.png");
	}
}
