
package com.pseudorygium.client.renderer;

public class HeronRenderer extends MobRenderer<HeronEntity, LivingEntityRenderState, Modelheron> {
	private HeronEntity entity = null;

	public HeronRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelheron(context.bakeLayer(Modelheron.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HeronEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/heron.png");
	}
}
