
package com.pseudorygium.client.renderer;

public class SwanRenderer extends MobRenderer<SwanEntity, LivingEntityRenderState, Modelswan> {
	private SwanEntity entity = null;

	public SwanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswan(context.bakeLayer(Modelswan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SwanEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/swan.png");
	}
}
