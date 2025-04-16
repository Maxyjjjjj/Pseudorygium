
package com.pseudorygium.client.renderer;

public class ElephantRenderer extends MobRenderer<ElephantEntity, LivingEntityRenderState, Modelelephant> {
	private ElephantEntity entity = null;

	public ElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelephant(context.bakeLayer(Modelelephant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ElephantEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/elephant_small_tusks.png");
	}
}
