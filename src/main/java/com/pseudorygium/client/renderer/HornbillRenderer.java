
package com.pseudorygium.client.renderer;

public class HornbillRenderer extends MobRenderer<HornbillEntity, LivingEntityRenderState, Modelhornbill> {
	private HornbillEntity entity = null;

	public HornbillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhornbill(context.bakeLayer(Modelhornbill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HornbillEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hornbill.png");
	}
}
