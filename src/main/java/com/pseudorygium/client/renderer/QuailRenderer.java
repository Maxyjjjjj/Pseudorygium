
package com.pseudorygium.client.renderer;

public class QuailRenderer extends MobRenderer<QuailEntity, LivingEntityRenderState, Modelquail> {
	private QuailEntity entity = null;

	public QuailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelquail(context.bakeLayer(Modelquail.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(QuailEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/quail.png");
	}
}
