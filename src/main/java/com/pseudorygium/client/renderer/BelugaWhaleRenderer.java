
package com.pseudorygium.client.renderer;

public class BelugaWhaleRenderer extends MobRenderer<BelugaWhaleEntity, LivingEntityRenderState, Modelbeluga_whale> {
	private BelugaWhaleEntity entity = null;

	public BelugaWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeluga_whale(context.bakeLayer(Modelbeluga_whale.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BelugaWhaleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dolphin5.png");
	}
}
