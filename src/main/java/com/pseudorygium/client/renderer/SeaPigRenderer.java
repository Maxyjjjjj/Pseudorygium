
package com.pseudorygium.client.renderer;

public class SeaPigRenderer extends MobRenderer<SeaPigEntity, LivingEntityRenderState, Modelsea_pig> {
	private SeaPigEntity entity = null;

	public SeaPigRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsea_pig(context.bakeLayer(Modelsea_pig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeaPigEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sea_pig.png");
	}
}
