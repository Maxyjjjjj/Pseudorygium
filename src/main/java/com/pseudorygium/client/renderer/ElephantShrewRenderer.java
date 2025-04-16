
package com.pseudorygium.client.renderer;

public class ElephantShrewRenderer extends MobRenderer<ElephantShrewEntity, LivingEntityRenderState, Modelelephant_shrew> {
	private ElephantShrewEntity entity = null;

	public ElephantShrewRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelephant_shrew(context.bakeLayer(Modelelephant_shrew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ElephantShrewEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/elephant_shrew.png");
	}
}
