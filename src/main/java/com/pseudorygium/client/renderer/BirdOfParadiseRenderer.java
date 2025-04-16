
package com.pseudorygium.client.renderer;

public class BirdOfParadiseRenderer extends MobRenderer<BirdOfParadiseEntity, LivingEntityRenderState, Modelbird_of_paradise> {
	private BirdOfParadiseEntity entity = null;

	public BirdOfParadiseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbird_of_paradise(context.bakeLayer(Modelbird_of_paradise.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BirdOfParadiseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bird_of_paradise.png");
	}
}
