
package com.pseudorygium.client.renderer;

public class ChacmaBaboonRenderer extends MobRenderer<ChacmaBaboonEntity, LivingEntityRenderState, Modelbaboon> {
	private ChacmaBaboonEntity entity = null;

	public ChacmaBaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaboon(context.bakeLayer(Modelbaboon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChacmaBaboonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chacma_baboon.png");
	}
}
