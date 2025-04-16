
package com.pseudorygium.client.renderer;

public class CarpRenderer extends MobRenderer<CarpEntity, LivingEntityRenderState, Modelcarp> {
	private CarpEntity entity = null;

	public CarpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcarp(context.bakeLayer(Modelcarp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CarpEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/carp.png");
	}
}
