
package com.pseudorygium.client.renderer;

public class FlamingoRenderer extends MobRenderer<FlamingoEntity, LivingEntityRenderState, Modelflamingo> {
	private FlamingoEntity entity = null;

	public FlamingoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflamingo(context.bakeLayer(Modelflamingo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FlamingoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/flamingo_pink.png");
	}
}
