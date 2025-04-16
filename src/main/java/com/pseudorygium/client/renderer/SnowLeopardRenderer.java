
package com.pseudorygium.client.renderer;

public class SnowLeopardRenderer extends MobRenderer<SnowLeopardEntity, LivingEntityRenderState, Modelsnow_leopard> {
	private SnowLeopardEntity entity = null;

	public SnowLeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnow_leopard(context.bakeLayer(Modelsnow_leopard.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SnowLeopardEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snow_leopard.png");
	}
}
