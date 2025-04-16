
package com.pseudorygium.client.renderer;

public class SeaOtterRenderer extends MobRenderer<SeaOtterEntity, LivingEntityRenderState, Modelsea_otter> {
	private SeaOtterEntity entity = null;

	public SeaOtterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_otter(context.bakeLayer(Modelsea_otter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeaOtterEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_otter.png");
	}
}
