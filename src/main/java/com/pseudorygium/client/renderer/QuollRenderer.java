
package com.pseudorygium.client.renderer;

public class QuollRenderer extends MobRenderer<QuollEntity, LivingEntityRenderState, Modelquoll> {
	private QuollEntity entity = null;

	public QuollRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquoll(context.bakeLayer(Modelquoll.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(QuollEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/quoll.png");
	}
}
