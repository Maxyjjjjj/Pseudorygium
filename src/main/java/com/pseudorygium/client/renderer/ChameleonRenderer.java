
package com.pseudorygium.client.renderer;

public class ChameleonRenderer extends MobRenderer<ChameleonEntity, LivingEntityRenderState, Modelchameleon> {
	private ChameleonEntity entity = null;

	public ChameleonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchameleon(context.bakeLayer(Modelchameleon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChameleonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chameleon.png");
	}
}
