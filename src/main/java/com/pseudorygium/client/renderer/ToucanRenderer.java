
package com.pseudorygium.client.renderer;

public class ToucanRenderer extends MobRenderer<ToucanEntity, LivingEntityRenderState, Modeltoucan> {
	private ToucanEntity entity = null;

	public ToucanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoucan(context.bakeLayer(Modeltoucan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ToucanEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/toucan.png");
	}
}
