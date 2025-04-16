
package com.pseudorygium.client.renderer;

public class BarreleyeRenderer extends MobRenderer<BarreleyeEntity, LivingEntityRenderState, Modelbarreleye> {
	private BarreleyeEntity entity = null;

	public BarreleyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbarreleye(context.bakeLayer(Modelbarreleye.LAYER_LOCATION)), 0.7f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("pseudorygium:textures/entities/barreleye.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modelbarreleye(Minecraft.getInstance().getEntityModels().bakeLayer(Modelbarreleye.LAYER_LOCATION));
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
	public void extractRenderState(BarreleyeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/barreleye.png");
	}
}
