
package com.pseudorygium.client.renderer;

public class MarabouRenderer extends MobRenderer<MarabouEntity, LivingEntityRenderState, Modelmarabou_stork> {
	private MarabouEntity entity = null;

	public MarabouRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarabou_stork(context.bakeLayer(Modelmarabou_stork.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MarabouEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/maraboustork.png");
	}
}
