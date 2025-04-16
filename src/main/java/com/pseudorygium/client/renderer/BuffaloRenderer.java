
package com.pseudorygium.client.renderer;

public class BuffaloRenderer extends MobRenderer<BuffaloEntity, LivingEntityRenderState, Modelbuffalo> {
	private BuffaloEntity entity = null;

	public BuffaloRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbuffalo(context.bakeLayer(Modelbuffalo.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BuffaloEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/buffalo.png");
	}
}
