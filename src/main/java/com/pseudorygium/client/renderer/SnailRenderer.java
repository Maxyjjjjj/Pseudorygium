
package com.pseudorygium.client.renderer;

public class SnailRenderer extends MobRenderer<SnailEntity, LivingEntityRenderState, Modelsnail> {
	private SnailEntity entity = null;

	public SnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnail(context.bakeLayer(Modelsnail.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SnailEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snail.png");
	}
}
