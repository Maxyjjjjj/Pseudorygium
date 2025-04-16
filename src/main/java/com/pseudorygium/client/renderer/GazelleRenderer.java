
package com.pseudorygium.client.renderer;

public class GazelleRenderer extends MobRenderer<GazelleEntity, LivingEntityRenderState, Modelgazelle> {
	private GazelleEntity entity = null;

	public GazelleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgazelle(context.bakeLayer(Modelgazelle.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GazelleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gazelle.png");
	}
}
