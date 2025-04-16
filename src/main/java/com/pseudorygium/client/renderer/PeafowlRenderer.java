
package com.pseudorygium.client.renderer;

public class PeafowlRenderer extends MobRenderer<PeafowlEntity, LivingEntityRenderState, Modelpeafowl> {
	private PeafowlEntity entity = null;

	public PeafowlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpeafowl(context.bakeLayer(Modelpeafowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PeafowlEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/peafowl.png");
	}
}
