
package com.pseudorygium.client.renderer;

public class GiraffeRenderer extends MobRenderer<GiraffeEntity, LivingEntityRenderState, Modelgiraffe> {
	private GiraffeEntity entity = null;

	public GiraffeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiraffe(context.bakeLayer(Modelgiraffe.LAYER_LOCATION)), 1.2f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/giraffe.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelgiraffe(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgiraffe.LAYER_LOCATION));
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
	public void extractRenderState(GiraffeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/giraffe.png");
	}
}
