
package com.pseudorygium.client.renderer;

public class SalamanderRenderer extends MobRenderer<SalamanderEntity, LivingEntityRenderState, Modelsalamander> {
	private SalamanderEntity entity = null;

	public SalamanderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsalamander(context.bakeLayer(Modelsalamander.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SalamanderEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/salamander.png");
	}
}
