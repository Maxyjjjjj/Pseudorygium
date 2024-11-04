
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OryxEntity;
import com.pseudorygium.client.model.Modelgemsbok;

import com.mojang.blaze3d.vertex.PoseStack;

public class OryxRenderer extends MobRenderer<OryxEntity, Modelgemsbok<OryxEntity>> {
	public OryxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgemsbok(context.bakeLayer(Modelgemsbok.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(OryxEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.4f, 1.4f, 1.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(OryxEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gemsbok-on-planetminecraft-com_1.png");
	}
}
