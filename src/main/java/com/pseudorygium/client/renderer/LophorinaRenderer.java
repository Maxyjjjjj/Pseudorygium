
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LophorinaEntity;
import com.pseudorygium.client.model.Modellophorina;

public class LophorinaRenderer extends MobRenderer<LophorinaEntity, Modellophorina<LophorinaEntity>> {
	public LophorinaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellophorina(context.bakeLayer(Modellophorina.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LophorinaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lophorina.png");
	}
}
