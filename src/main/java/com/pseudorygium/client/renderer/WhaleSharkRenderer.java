
package com.pseudorygium.client.renderer;

public class WhaleSharkRenderer extends MobRenderer<WhaleSharkEntity, LivingEntityRenderState, Modelwhale_shark> {
	private WhaleSharkEntity entity = null;

	public WhaleSharkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhale_shark(context.bakeLayer(Modelwhale_shark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WhaleSharkEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/whale_shark.png");
	}
}
