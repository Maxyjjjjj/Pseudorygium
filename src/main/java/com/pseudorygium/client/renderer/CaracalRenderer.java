
package com.pseudorygium.client.renderer;

public class CaracalRenderer extends MobRenderer<CaracalEntity, LivingEntityRenderState, Modelcaracal> {
	private CaracalEntity entity = null;

	public CaracalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaracal(context.bakeLayer(Modelcaracal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CaracalEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/caracal.png");
	}
}
