
package com.pseudorygium.client.renderer;

public class RoadrunnerRenderer extends MobRenderer<RoadrunnerEntity, LivingEntityRenderState, Modelroadrunner> {
	private RoadrunnerEntity entity = null;

	public RoadrunnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroadrunner(context.bakeLayer(Modelroadrunner.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RoadrunnerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/roadrunner.png");
	}
}
