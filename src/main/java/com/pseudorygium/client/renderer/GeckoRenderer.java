
package com.pseudorygium.client.renderer;

public class GeckoRenderer extends MobRenderer<GeckoEntity, LivingEntityRenderState, Modelgecko> {
	private GeckoEntity entity = null;

	public GeckoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgecko(context.bakeLayer(Modelgecko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GeckoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gecko.png");
	}
}
