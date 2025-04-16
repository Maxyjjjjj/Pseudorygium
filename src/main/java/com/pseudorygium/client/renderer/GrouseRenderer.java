
package com.pseudorygium.client.renderer;

public class GrouseRenderer extends MobRenderer<GrouseEntity, LivingEntityRenderState, Modelgrouse> {
	private GrouseEntity entity = null;

	public GrouseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrouse(context.bakeLayer(Modelgrouse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GrouseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/grouse.png");
	}
}
