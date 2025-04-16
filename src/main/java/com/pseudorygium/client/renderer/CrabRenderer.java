
package com.pseudorygium.client.renderer;

public class CrabRenderer extends MobRenderer<CrabEntity, LivingEntityRenderState, Modelcrab> {
	private CrabEntity entity = null;

	public CrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrab(context.bakeLayer(Modelcrab.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrabEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crab.png");
	}
}
