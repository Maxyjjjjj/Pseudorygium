
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

import com.pseudorygium.entity.GiraffeEntity;
import com.pseudorygium.client.model.Modelgiraffe;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GiraffeRenderer extends MobRenderer<GiraffeEntity, Modelgiraffe<GiraffeEntity>> {
	public GiraffeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiraffe(context.bakeLayer(Modelgiraffe.LAYER_LOCATION)), 1.2f);
		this.addLayer(new RenderLayer<GiraffeEntity, Modelgiraffe<GiraffeEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/giraffe.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, GiraffeEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelgiraffe(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgiraffe.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GiraffeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/giraffe.png");
	}
}
