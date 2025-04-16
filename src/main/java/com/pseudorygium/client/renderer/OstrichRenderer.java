
package com.pseudorygium.client.renderer;

public class OstrichRenderer extends MobRenderer<OstrichEntity, LivingEntityRenderState, Modelostrich> {
	private OstrichEntity entity = null;

	public OstrichRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelostrich(context.bakeLayer(Modelostrich.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OstrichEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ostrich.png");
	}
}
