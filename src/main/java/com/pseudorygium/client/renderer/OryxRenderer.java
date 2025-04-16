
package com.pseudorygium.client.renderer;

public class OryxRenderer extends MobRenderer<OryxEntity, LivingEntityRenderState, Modelgemsbok> {
	private OryxEntity entity = null;

	public OryxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgemsbok(context.bakeLayer(Modelgemsbok.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OryxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gemsbok-on-planetminecraft-com_1.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.4f, 1.4f, 1.4f);
	}
}
