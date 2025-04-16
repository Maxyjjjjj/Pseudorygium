
package com.pseudorygium.client.renderer;

public class BadgerRenderer extends MobRenderer<BadgerEntity, LivingEntityRenderState, Modelbadger> {
	private BadgerEntity entity = null;

	public BadgerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbadger(context.bakeLayer(Modelbadger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BadgerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/badger.png");
	}
}
