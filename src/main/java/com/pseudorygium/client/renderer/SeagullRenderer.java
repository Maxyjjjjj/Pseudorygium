
package com.pseudorygium.client.renderer;

public class SeagullRenderer extends MobRenderer<SeagullEntity, LivingEntityRenderState, Modelseagull> {
	private SeagullEntity entity = null;

	public SeagullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseagull(context.bakeLayer(Modelseagull.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeagullEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seagull.png");
	}
}
