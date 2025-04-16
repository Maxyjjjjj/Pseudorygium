
package com.pseudorygium.client.renderer;

public class EagleRenderer extends MobRenderer<EagleEntity, LivingEntityRenderState, Modeleagle> {
	private EagleEntity entity = null;

	public EagleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleagle(context.bakeLayer(Modeleagle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EagleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/eagle.png");
	}
}
