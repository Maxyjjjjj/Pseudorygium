
package com.pseudorygium.client.renderer;

public class TanukiRenderer extends MobRenderer<TanukiEntity, LivingEntityRenderState, Modeltanuki> {
	private TanukiEntity entity = null;

	public TanukiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltanuki(context.bakeLayer(Modeltanuki.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TanukiEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tanuki.png");
	}
}
