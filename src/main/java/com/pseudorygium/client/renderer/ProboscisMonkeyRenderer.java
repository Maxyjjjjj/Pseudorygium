
package com.pseudorygium.client.renderer;

public class ProboscisMonkeyRenderer extends MobRenderer<ProboscisMonkeyEntity, LivingEntityRenderState, Modelproboscis_monkey> {
	private ProboscisMonkeyEntity entity = null;

	public ProboscisMonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelproboscis_monkey(context.bakeLayer(Modelproboscis_monkey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ProboscisMonkeyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/proboscis_monkey.png");
	}
}
