
package com.pseudorygium.client.renderer;

public class EchidnaRenderer extends MobRenderer<EchidnaEntity, LivingEntityRenderState, Modelechidna> {
	private EchidnaEntity entity = null;

	public EchidnaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelechidna(context.bakeLayer(Modelechidna.LAYER_LOCATION)), 0.9f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/echidna.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelechidna(Minecraft.getInstance().getEntityModels().bakeLayer(Modelechidna.LAYER_LOCATION));
				model.setupAnim(state);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EchidnaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/echidna.png");
	}
}
