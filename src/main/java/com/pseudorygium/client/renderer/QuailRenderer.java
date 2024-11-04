
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.QuailEntity;
import com.pseudorygium.client.model.Modelquail;

public class QuailRenderer extends MobRenderer<QuailEntity, Modelquail<QuailEntity>> {
	public QuailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquail(context.bakeLayer(Modelquail.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(QuailEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/quail.png");
	}
}
