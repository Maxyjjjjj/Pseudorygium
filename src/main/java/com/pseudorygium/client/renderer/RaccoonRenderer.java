
package com.pseudorygium.client.renderer;

public class RaccoonRenderer extends MobRenderer<RaccoonEntity, LivingEntityRenderState, Modelracoon> {
	private RaccoonEntity entity = null;

	public RaccoonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelracoon(context.bakeLayer(Modelracoon.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RaccoonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/racoon.png");
	}
}
