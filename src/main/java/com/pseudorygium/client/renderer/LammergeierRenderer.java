
package com.pseudorygium.client.renderer;

public class LammergeierRenderer extends MobRenderer<LammergeierEntity, LivingEntityRenderState, Modellammergeier> {
	private LammergeierEntity entity = null;

	public LammergeierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellammergeier(context.bakeLayer(Modellammergeier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LammergeierEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lammergeier.png");
	}
}
