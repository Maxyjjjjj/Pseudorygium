
package com.pseudorygium.client.renderer;

public class BoobyRenderer extends MobRenderer<BoobyEntity, LivingEntityRenderState, Modelbooby> {
	private BoobyEntity entity = null;

	public BoobyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbooby(context.bakeLayer(Modelbooby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BoobyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/booby.png");
	}
}
