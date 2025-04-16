
package com.pseudorygium.client.renderer;

public class ForestBuffaloRenderer extends MobRenderer<ForestBuffaloEntity, LivingEntityRenderState, Modelforest_buffalo> {
	private ForestBuffaloEntity entity = null;

	public ForestBuffaloRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelforest_buffalo(context.bakeLayer(Modelforest_buffalo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ForestBuffaloEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/forest_buffalo.png");
	}
}
