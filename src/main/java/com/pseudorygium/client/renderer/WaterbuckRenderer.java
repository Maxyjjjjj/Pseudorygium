
package com.pseudorygium.client.renderer;

public class WaterbuckRenderer extends MobRenderer<WaterbuckEntity, LivingEntityRenderState, Modelwaterbuck> {
	private WaterbuckEntity entity = null;

	public WaterbuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwaterbuck(context.bakeLayer(Modelwaterbuck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WaterbuckEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/waterbuck.png");
	}
}
