
package com.pseudorygium.client.renderer;

public class PronghornRenderer extends MobRenderer<PronghornEntity, LivingEntityRenderState, Modelpronghorn> {
	private PronghornEntity entity = null;

	public PronghornRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpronghorn(context.bakeLayer(Modelpronghorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PronghornEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pronghorn.png");
	}
}
