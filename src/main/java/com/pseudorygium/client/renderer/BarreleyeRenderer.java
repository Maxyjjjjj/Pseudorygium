
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import com.pseudorygium.entity.BarreleyeEntity;
import com.pseudorygium.client.model.Modelbarreleye;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BarreleyeRenderer extends MobRenderer<BarreleyeEntity, Modelbarreleye<BarreleyeEntity>> {
	public BarreleyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbarreleye(context.bakeLayer(Modelbarreleye.LAYER_LOCATION)), 0.7f);
		this.addLayer(new RenderLayer<BarreleyeEntity, Modelbarreleye<BarreleyeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/barreleye.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BarreleyeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelbarreleye(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbarreleye.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BarreleyeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/barreleye.png");
	}
}
