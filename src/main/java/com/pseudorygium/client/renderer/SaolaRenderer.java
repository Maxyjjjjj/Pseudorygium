
package com.pseudorygium.client.renderer;

public class SaolaRenderer extends MobRenderer<SaolaEntity, LivingEntityRenderState, Modelsaola> {
	private SaolaEntity entity = null;

	public SaolaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaola(context.bakeLayer(Modelsaola.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SaolaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/saola.png");
	}
}
