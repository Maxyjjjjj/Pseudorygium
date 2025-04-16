
package com.pseudorygium.client.renderer;

public class CaecilianRenderer extends MobRenderer<CaecilianEntity, LivingEntityRenderState, Modelcaecilian> {
	private CaecilianEntity entity = null;

	public CaecilianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaecilian(context.bakeLayer(Modelcaecilian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CaecilianEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/caecilian.png");
	}
}
