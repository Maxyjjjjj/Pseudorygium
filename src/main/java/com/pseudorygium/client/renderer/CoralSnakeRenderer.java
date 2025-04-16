
package com.pseudorygium.client.renderer;

public class CoralSnakeRenderer extends MobRenderer<CoralSnakeEntity, LivingEntityRenderState, Modelsnake> {
	private CoralSnakeEntity entity = null;

	public CoralSnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnake(context.bakeLayer(Modelsnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CoralSnakeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snake_coral.png");
	}
}
