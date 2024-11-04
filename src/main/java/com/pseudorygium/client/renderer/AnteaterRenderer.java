
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AnteaterEntity;
import com.pseudorygium.client.model.Modelanteater;

import com.mojang.blaze3d.vertex.PoseStack;

public class AnteaterRenderer extends MobRenderer<AnteaterEntity, Modelanteater<AnteaterEntity>> {
	public AnteaterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanteater(context.bakeLayer(Modelanteater.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(AnteaterEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnteaterEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/anteater.png");
	}
}
