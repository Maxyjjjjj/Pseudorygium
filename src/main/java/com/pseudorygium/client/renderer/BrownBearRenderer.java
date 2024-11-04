
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

import com.pseudorygium.entity.BrownBearEntity;
import com.pseudorygium.client.model.Modelbrown_bear;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrownBearRenderer extends MobRenderer<BrownBearEntity, Modelbrown_bear<BrownBearEntity>> {
	public BrownBearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbrown_bear(context.bakeLayer(Modelbrown_bear.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<BrownBearEntity, Modelbrown_bear<BrownBearEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/brown_bear.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BrownBearEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelbrown_bear(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbrown_bear.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BrownBearEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/brown_bear.png");
	}
}
