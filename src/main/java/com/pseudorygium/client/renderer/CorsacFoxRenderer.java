
package com.pseudorygium.client.renderer;

public class CorsacFoxRenderer extends MobRenderer<CorsacFoxEntity, LivingEntityRenderState, Modelcorsac_fox> {
	private CorsacFoxEntity entity = null;

	public CorsacFoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorsac_fox(context.bakeLayer(Modelcorsac_fox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CorsacFoxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fox10.png");
	}
}
