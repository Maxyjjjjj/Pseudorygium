
package com.pseudorygium.client.renderer;

public class HamadryasBaboonRenderer extends MobRenderer<HamadryasBaboonEntity, LivingEntityRenderState, Modelbaboon> {
	private HamadryasBaboonEntity entity = null;

	public HamadryasBaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaboon(context.bakeLayer(Modelbaboon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HamadryasBaboonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hamadryas_baboon.png");
	}
}
