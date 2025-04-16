
package com.pseudorygium.client.renderer;

public class SwallowRenderer extends MobRenderer<SwallowEntity, LivingEntityRenderState, Modelswallow> {
	private SwallowEntity entity = null;

	public SwallowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswallow(context.bakeLayer(Modelswallow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SwallowEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/swallow.png");
	}
}
