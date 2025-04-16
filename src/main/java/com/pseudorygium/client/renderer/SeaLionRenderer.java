
package com.pseudorygium.client.renderer;

public class SeaLionRenderer extends MobRenderer<SeaLionEntity, LivingEntityRenderState, Modelsea_lion> {
	private SeaLionEntity entity = null;

	public SeaLionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_lion(context.bakeLayer(Modelsea_lion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeaLionEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_lion.png");
	}
}
