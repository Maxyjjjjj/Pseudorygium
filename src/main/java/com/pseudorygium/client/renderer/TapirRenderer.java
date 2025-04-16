
package com.pseudorygium.client.renderer;

public class TapirRenderer extends MobRenderer<TapirEntity, LivingEntityRenderState, Modeltapir> {
	private TapirEntity entity = null;

	public TapirRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltapir(context.bakeLayer(Modeltapir.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TapirEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tapir.png");
	}
}
