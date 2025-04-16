
package com.pseudorygium.client.renderer;

public class FruitBatRenderer extends MobRenderer<FruitBatEntity, LivingEntityRenderState, Modelfruit_bat> {
	private FruitBatEntity entity = null;

	public FruitBatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfruit_bat(context.bakeLayer(Modelfruit_bat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FruitBatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fruit_bat.png");
	}
}
