
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.pseudorygium.entity.ZebraEntity;
import com.pseudorygium.client.model.Modelzebra;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ZebraRenderer extends MobRenderer<ZebraEntity, Modelzebra<ZebraEntity>> {
	public ZebraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebra(context.bakeLayer(Modelzebra.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<ZebraEntity, Modelzebra<ZebraEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/zebra.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ZebraEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ZebraEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/zebra.png");
	}
}
