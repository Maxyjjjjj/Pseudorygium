
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

import com.pseudorygium.procedures.StoatDisplayConditionProcedure;
import com.pseudorygium.entity.StoatEntity;
import com.pseudorygium.client.model.Modelstoat;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StoatRenderer extends MobRenderer<StoatEntity, Modelstoat<StoatEntity>> {
	public StoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstoat(context.bakeLayer(Modelstoat.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<StoatEntity, Modelstoat<StoatEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/stoat_summer.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoatEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelstoat(Minecraft.getInstance().getEntityModels().bakeLayer(Modelstoat.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<StoatEntity, Modelstoat<StoatEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/stoat_winter.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StoatEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoatDisplayConditionProcedure.execute(world, x, y, z)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelstoat(Minecraft.getInstance().getEntityModels().bakeLayer(Modelstoat.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StoatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/stoat_summer.png");
	}
}
