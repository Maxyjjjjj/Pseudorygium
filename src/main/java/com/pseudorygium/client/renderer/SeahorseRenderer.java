
package com.pseudorygium.client.renderer;

public class SeahorseRenderer extends MobRenderer<SeahorseEntity, LivingEntityRenderState, Modelseahorse> {
	private SeahorseEntity entity = null;

	public SeahorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseahorse(context.bakeLayer(Modelseahorse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SeahorseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seahorse_yellow.png");
	}
}
