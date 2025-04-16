
package com.pseudorygium.client.renderer;

public class CobraRenderer extends MobRenderer<CobraEntity, LivingEntityRenderState, Modelcobra> {
	private CobraEntity entity = null;

	public CobraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcobra(context.bakeLayer(Modelcobra.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CobraEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cobra.png");
	}
}
