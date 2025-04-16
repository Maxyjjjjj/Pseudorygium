
package com.pseudorygium.client.renderer;

public class ChaffinchRenderer extends MobRenderer<ChaffinchEntity, LivingEntityRenderState, Modelpasserine> {
	private ChaffinchEntity entity = null;

	public ChaffinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChaffinchEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chaffinch.png");
	}
}
