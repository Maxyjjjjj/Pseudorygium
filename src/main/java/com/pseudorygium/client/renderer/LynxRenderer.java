
package com.pseudorygium.client.renderer;

public class LynxRenderer extends MobRenderer<LynxEntity, LivingEntityRenderState, Modellynx> {
	private LynxEntity entity = null;

	public LynxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellynx(context.bakeLayer(Modellynx.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LynxEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lynx.png");
	}
}
