
package com.pseudorygium.client.renderer;

public class LemurRenderer extends MobRenderer<LemurEntity, LivingEntityRenderState, Modellemur> {
	private LemurEntity entity = null;

	public LemurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellemur(context.bakeLayer(Modellemur.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LemurEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lemur.png");
	}
}
