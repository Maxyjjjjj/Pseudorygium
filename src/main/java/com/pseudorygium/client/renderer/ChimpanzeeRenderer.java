
package com.pseudorygium.client.renderer;

public class ChimpanzeeRenderer extends MobRenderer<ChimpanzeeEntity, LivingEntityRenderState, Modelchimpanzee> {
	private ChimpanzeeEntity entity = null;

	public ChimpanzeeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchimpanzee(context.bakeLayer(Modelchimpanzee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChimpanzeeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chimpanzee.png");
	}
}
