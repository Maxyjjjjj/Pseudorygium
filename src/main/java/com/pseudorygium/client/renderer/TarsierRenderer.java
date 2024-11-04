
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

import com.pseudorygium.entity.TarsierEntity;
import com.pseudorygium.client.model.Modeltarsier;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TarsierRenderer extends MobRenderer<TarsierEntity, Modeltarsier<TarsierEntity>> {
	public TarsierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltarsier(context.bakeLayer(Modeltarsier.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<TarsierEntity, Modeltarsier<TarsierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/tarsier_eyes.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TarsierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modeltarsier(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltarsier.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<TarsierEntity, Modeltarsier<TarsierEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/tarsier.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TarsierEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modeltarsier(Minecraft.getInstance().getEntityModels().bakeLayer(Modeltarsier.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TarsierEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tarsier.png");
	}
}
