
package com.pseudorygium.client.renderer;

public class PrzevalskiHorseRenderer extends MobRenderer<PrzevalskiHorseEntity, LivingEntityRenderState, Modelprzevalski_horse> {
	private PrzevalskiHorseEntity entity = null;

	public PrzevalskiHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprzevalski_horse(context.bakeLayer(Modelprzevalski_horse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PrzevalskiHorseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/przevalski_horse.png");
	}
}
