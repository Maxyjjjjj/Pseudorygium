
package com.pseudorygium.client.renderer;

public class HoneyBadgerRenderer extends MobRenderer<HoneyBadgerEntity, LivingEntityRenderState, Modelhoney_badger> {
	private HoneyBadgerEntity entity = null;

	public HoneyBadgerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoney_badger(context.bakeLayer(Modelhoney_badger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HoneyBadgerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/honey_badger.png");
	}
}
