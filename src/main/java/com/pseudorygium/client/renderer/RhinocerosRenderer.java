
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RhinocerosEntity;
import com.pseudorygium.client.model.Modelrhinoceros;

import com.mojang.blaze3d.vertex.PoseStack;

public class RhinocerosRenderer extends MobRenderer<RhinocerosEntity, Modelrhinoceros<RhinocerosEntity>> {
	public RhinocerosRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrhinoceros(context.bakeLayer(Modelrhinoceros.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(RhinocerosEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RhinocerosEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rhinoceros.png");
	}
}
