package com.pseudorygium.client.renderer;

import com.mojang.math.Axis;

public class CamelSpitRenderer extends EntityRenderer<CamelSpitEntity, LivingEntityRenderState> {

	private static final ResourceLocation texture = ResourceLocation.parse("pseudorygium:textures/entities/camel_spit.png");

	private final Modelcamel_spit model;

	public CamelSpitRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelcamel_spit(context.bakeLayer(Modelcamel_spit.LAYER_LOCATION));
	}

	@Override
	public void render(LivingEntityRenderState state, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(texture));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(state.yRot - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + state.xRot));
		model.setupAnim(state);
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY);
		poseStack.popPose();

		super.render(state, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CamelSpitEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		state.xRot = entity.getXRot(partialTicks);
		state.yRot = entity.getYRot(partialTicks);
	}

}
