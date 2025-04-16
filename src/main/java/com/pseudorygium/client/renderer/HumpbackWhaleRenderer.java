
package com.pseudorygium.client.renderer;

public class HumpbackWhaleRenderer extends MobRenderer<HumpbackWhaleEntity, LivingEntityRenderState, Modelhumpback_whale> {
	private HumpbackWhaleEntity entity = null;

	public HumpbackWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhumpback_whale(context.bakeLayer(Modelhumpback_whale.LAYER_LOCATION)), 3f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HumpbackWhaleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/humpback.png");
	}
}
