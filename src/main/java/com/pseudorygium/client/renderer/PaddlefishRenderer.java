
package com.pseudorygium.client.renderer;

public class PaddlefishRenderer extends MobRenderer<PaddlefishEntity, LivingEntityRenderState, Modelpaddlefish> {
	private PaddlefishEntity entity = null;

	public PaddlefishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpaddlefish(context.bakeLayer(Modelpaddlefish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PaddlefishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/paddlefish.png");
	}
}
