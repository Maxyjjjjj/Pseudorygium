
package com.pseudorygium.client.renderer;

public class GorillaRenderer extends MobRenderer<GorillaEntity, LivingEntityRenderState, Modelgorilla> {
	private GorillaEntity entity = null;

	public GorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgorilla(context.bakeLayer(Modelgorilla.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GorillaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gorilla.png");
	}
}
