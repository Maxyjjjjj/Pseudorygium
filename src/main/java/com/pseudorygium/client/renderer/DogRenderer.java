
package com.pseudorygium.client.renderer;

public class DogRenderer extends MobRenderer<DogEntity, LivingEntityRenderState, Modeldog> {
	private DogEntity entity = null;

	public DogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldog(context.bakeLayer(Modeldog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DogEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dog.png");
	}
}
