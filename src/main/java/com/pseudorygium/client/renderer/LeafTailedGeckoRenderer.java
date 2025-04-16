
package com.pseudorygium.client.renderer;

public class LeafTailedGeckoRenderer extends MobRenderer<LeafTailedGeckoEntity, LivingEntityRenderState, Modelleaftailed_gecko> {
	private LeafTailedGeckoEntity entity = null;

	public LeafTailedGeckoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelleaftailed_gecko(context.bakeLayer(Modelleaftailed_gecko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LeafTailedGeckoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/leaftailed_gecko.png");
	}
}
