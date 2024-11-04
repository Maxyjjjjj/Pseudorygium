
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ShrimpEntity;
import com.pseudorygium.client.model.Modelshrimp;

public class ShrimpRenderer extends MobRenderer<ShrimpEntity, Modelshrimp<ShrimpEntity>> {
	public ShrimpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshrimp(context.bakeLayer(Modelshrimp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShrimpEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/shrimp.png");
	}
}
