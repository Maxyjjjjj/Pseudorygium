
package com.pseudorygium.client.renderer;

public class PumaRenderer extends MobRenderer<PumaEntity, LivingEntityRenderState, Modelpuma> {
	private PumaEntity entity = null;

	public PumaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuma(context.bakeLayer(Modelpuma.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PumaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/puma.png");
	}
}
