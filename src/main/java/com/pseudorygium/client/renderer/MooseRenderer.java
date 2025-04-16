
package com.pseudorygium.client.renderer;

public class MooseRenderer extends MobRenderer<MooseEntity, LivingEntityRenderState, Modelmoose> {
	private MooseEntity entity = null;

	public MooseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoose(context.bakeLayer(Modelmoose.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MooseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/moose.png");
	}
}
