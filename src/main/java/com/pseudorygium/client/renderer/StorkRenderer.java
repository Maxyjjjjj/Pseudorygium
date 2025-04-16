
package com.pseudorygium.client.renderer;

public class StorkRenderer extends MobRenderer<StorkEntity, LivingEntityRenderState, Modelstork> {
	private StorkEntity entity = null;

	public StorkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstork(context.bakeLayer(Modelstork.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StorkEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/stork_white.png");
	}
}
