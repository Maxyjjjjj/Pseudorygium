
package com.pseudorygium.client.renderer;

public class RatRenderer extends MobRenderer<RatEntity, LivingEntityRenderState, Modelrat> {
	private RatEntity entity = null;

	public RatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrat(context.bakeLayer(Modelrat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rat_grey.png");
	}
}
