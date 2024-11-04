
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GrouseEntity;
import com.pseudorygium.client.model.Modelgrouse;

public class GrouseRenderer extends MobRenderer<GrouseEntity, Modelgrouse<GrouseEntity>> {
	public GrouseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrouse(context.bakeLayer(Modelgrouse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrouseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/grouse.png");
	}
}
