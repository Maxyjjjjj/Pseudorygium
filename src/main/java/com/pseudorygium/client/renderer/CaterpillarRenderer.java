
package com.pseudorygium.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import com.pseudorygium.procedures.CaterpillarDisplayConditionProcedure;
import com.pseudorygium.procedures.CaterpillarDisplayCondition1Procedure;
import com.pseudorygium.entity.CaterpillarEntity;
import com.pseudorygium.client.model.Modelcaterpillar;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CaterpillarRenderer extends MobRenderer<CaterpillarEntity, Modelcaterpillar<CaterpillarEntity>> {
	public CaterpillarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaterpillar(context.bakeLayer(Modelcaterpillar.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<CaterpillarEntity, Modelcaterpillar<CaterpillarEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/caterpillar_peafowl.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CaterpillarEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelcaterpillar(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcaterpillar.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<CaterpillarEntity, Modelcaterpillar<CaterpillarEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/caterpillar_machaon.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CaterpillarEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CaterpillarDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelcaterpillar(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcaterpillar.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<CaterpillarEntity, Modelcaterpillar<CaterpillarEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/caterpillar_monarch.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, CaterpillarEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (CaterpillarDisplayCondition1Procedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelcaterpillar(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcaterpillar.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CaterpillarEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/caterpillar_peafowl.png");
	}
}
