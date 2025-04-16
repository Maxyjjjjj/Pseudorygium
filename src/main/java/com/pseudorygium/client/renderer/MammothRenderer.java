
package com.pseudorygium.client.renderer;

public class MammothRenderer extends MobRenderer<MammothEntity, LivingEntityRenderState, Modelmammoth> {
	private MammothEntity entity = null;

	public MammothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmammoth(context.bakeLayer(Modelmammoth.LAYER_LOCATION)), 2f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/mammoth.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelmammoth(Minecraft.getInstance().getEntityModels().bakeLayer(Modelmammoth.LAYER_LOCATION));
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
	public void extractRenderState(MammothEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mammoth.png");
	}
}
