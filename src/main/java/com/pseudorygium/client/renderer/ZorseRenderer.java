
package com.pseudorygium.client.renderer;

public class ZorseRenderer extends MobRenderer<ZorseEntity, LivingEntityRenderState, Modelzebroid> {
	private ZorseEntity entity = null;

	public ZorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebroid(context.bakeLayer(Modelzebroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ZorseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/zorse.png");
	}
}
