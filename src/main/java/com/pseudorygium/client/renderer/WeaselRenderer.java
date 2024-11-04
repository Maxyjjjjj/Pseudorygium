
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
import com.pseudorygium.entity.WeaselEntity;
import com.pseudorygium.client.model.Modelweasel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WeaselRenderer extends MobRenderer<WeaselEntity, Modelweasel<WeaselEntity>> {
	public WeaselRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelweasel(context.bakeLayer(Modelweasel.LAYER_LOCATION)), 0.3f);
		this.addLayer(new RenderLayer<WeaselEntity, Modelweasel<WeaselEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/weasel_summer.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WeaselEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelweasel(Minecraft.getInstance().getEntityModels().bakeLayer(Modelweasel.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
		this.addLayer(new RenderLayer<WeaselEntity, Modelweasel<WeaselEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/weasel_winter.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, WeaselEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (StoatDisplayConditionProcedure.execute(world, x, y, z)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new Modelweasel(Minecraft.getInstance().getEntityModels().bakeLayer(Modelweasel.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(WeaselEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/weasel_summer.png");
	}
}
