
package com.pseudorygium.client.renderer;

public class BrownBearRenderer extends MobRenderer<BrownBearEntity, LivingEntityRenderState, Modelbrown_bear> {
	private BrownBearEntity entity = null;

	public BrownBearRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbrown_bear(context.bakeLayer(Modelbrown_bear.LAYER_LOCATION)), 1f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/brown_bear.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelbrown_bear(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbrown_bear.LAYER_LOCATION));
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
	public void extractRenderState(BrownBearEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/brown_bear.png");
	}
}
