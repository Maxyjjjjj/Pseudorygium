
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MouseLemurEntity;
import com.pseudorygium.client.model.Modelmouse_lemur;

import com.mojang.blaze3d.vertex.PoseStack;

public class MouseLemurRenderer extends MobRenderer<MouseLemurEntity, Modelmouse_lemur<MouseLemurEntity>> {
	public MouseLemurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouse_lemur(context.bakeLayer(Modelmouse_lemur.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(MouseLemurEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.45f, 0.45f, 0.45f);
	}

	@Override
	public ResourceLocation getTextureLocation(MouseLemurEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mouse_lemur.png");
	}
}
