
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SnailEntity;
import com.pseudorygium.client.model.Modelsnail;

public class SnailRenderer extends MobRenderer<SnailEntity, Modelsnail<SnailEntity>> {
	public SnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnail(context.bakeLayer(Modelsnail.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnailEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snail.png");
	}
}
