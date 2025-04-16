
package com.pseudorygium.client.renderer;

public class WhiteSharkRenderer extends MobRenderer<WhiteSharkEntity, LivingEntityRenderState, Modelwhite_shark> {
	private WhiteSharkEntity entity = null;

	public WhiteSharkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_shark(context.bakeLayer(Modelwhite_shark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WhiteSharkEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/white_shark.png");
	}
}
