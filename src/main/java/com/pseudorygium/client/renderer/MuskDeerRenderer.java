
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MuskDeerEntity;
import com.pseudorygium.client.model.Modelmusk_deer;

public class MuskDeerRenderer extends MobRenderer<MuskDeerEntity, Modelmusk_deer<MuskDeerEntity>> {
	public MuskDeerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmusk_deer(context.bakeLayer(Modelmusk_deer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MuskDeerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/musk_deer.png");
	}
}
