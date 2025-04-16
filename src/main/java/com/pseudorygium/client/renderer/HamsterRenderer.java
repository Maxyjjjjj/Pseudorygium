
package com.pseudorygium.client.renderer;

public class HamsterRenderer extends MobRenderer<HamsterEntity, LivingEntityRenderState, Modelhamster> {
	private HamsterEntity entity = null;

	public HamsterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhamster(context.bakeLayer(Modelhamster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HamsterEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hamster.png");
	}
}
