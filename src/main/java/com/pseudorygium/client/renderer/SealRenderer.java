
package com.pseudorygium.client.renderer;

public class SealRenderer extends MobRenderer<SealEntity, LivingEntityRenderState, Modelseal> {
	private SealEntity entity = null;

	public SealRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseal(context.bakeLayer(Modelseal.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SealEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seal_temperate.png");
	}
}
