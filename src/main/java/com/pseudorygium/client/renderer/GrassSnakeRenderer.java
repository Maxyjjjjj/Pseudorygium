
package com.pseudorygium.client.renderer;

public class GrassSnakeRenderer extends MobRenderer<GrassSnakeEntity, LivingEntityRenderState, Modelsnake> {
	private GrassSnakeEntity entity = null;

	public GrassSnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnake(context.bakeLayer(Modelsnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GrassSnakeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snake_grass.png");
	}
}
