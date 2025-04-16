
package com.pseudorygium.client.renderer;

public class LizardRenderer extends MobRenderer<LizardEntity, LivingEntityRenderState, Modellizard> {
	private LizardEntity entity = null;

	public LizardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellizard(context.bakeLayer(Modellizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LizardEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lizard.png");
	}
}
