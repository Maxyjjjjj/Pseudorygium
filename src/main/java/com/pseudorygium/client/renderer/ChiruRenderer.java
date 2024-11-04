
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChiruEntity;
import com.pseudorygium.client.model.Modelchiru;

import com.mojang.blaze3d.vertex.PoseStack;

public class ChiruRenderer extends MobRenderer<ChiruEntity, Modelchiru<ChiruEntity>> {
	public ChiruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchiru(context.bakeLayer(Modelchiru.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(ChiruEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.75f, 0.75f, 0.75f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChiruEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chiru.png");
	}
}
