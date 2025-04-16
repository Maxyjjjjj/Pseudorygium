
package com.pseudorygium.client.renderer;

public class PorcupineRenderer extends MobRenderer<PorcupineEntity, LivingEntityRenderState, Modelporcupine> {
	private PorcupineEntity entity = null;

	public PorcupineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelporcupine(context.bakeLayer(Modelporcupine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PorcupineEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/porcupine.png");
	}
}
