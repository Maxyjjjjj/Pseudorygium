
package com.pseudorygium.client.renderer;

public class SpringhareRenderer extends MobRenderer<SpringhareEntity, LivingEntityRenderState, Modelspringhare> {
	private SpringhareEntity entity = null;

	public SpringhareRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspringhare(context.bakeLayer(Modelspringhare.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SpringhareEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/spinghare.png");
	}
}
