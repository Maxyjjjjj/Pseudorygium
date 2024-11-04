
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

import com.pseudorygium.procedures.LionSpawningProcedure;
import com.pseudorygium.entity.LionEntity;
import com.pseudorygium.client.model.Modellion;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LionRenderer extends MobRenderer<LionEntity, Modellion<LionEntity>> {
	public LionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellion(context.bakeLayer(Modellion.LAYER_LOCATION)), 0.6f);
		this.addLayer(new RenderLayer<LionEntity, Modellion<LionEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/lion.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LionEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LionSpawningProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modellion(Minecraft.getInstance().getEntityModels().bakeLayer(Modellion.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<LionEntity, Modellion<LionEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/lioness.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LionEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (LionSpawningProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modellion(Minecraft.getInstance().getEntityModels().bakeLayer(Modellion.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(LionEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lion.png");
	}
}
