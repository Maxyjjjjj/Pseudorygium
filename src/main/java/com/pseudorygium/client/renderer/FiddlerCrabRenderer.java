
package com.pseudorygium.client.renderer;

public class FiddlerCrabRenderer extends MobRenderer<FiddlerCrabEntity, LivingEntityRenderState, Modelfiddler_crab> {
	private FiddlerCrabEntity entity = null;

	public FiddlerCrabRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfiddler_crab(context.bakeLayer(Modelfiddler_crab.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FiddlerCrabEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/carb_with_claw.png");
	}
}
