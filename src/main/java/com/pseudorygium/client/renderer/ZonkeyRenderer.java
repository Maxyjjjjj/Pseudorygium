
package com.pseudorygium.client.renderer;

public class ZonkeyRenderer extends MobRenderer<ZonkeyEntity, LivingEntityRenderState, Modelzebroid> {
	private ZonkeyEntity entity = null;

	public ZonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebroid(context.bakeLayer(Modelzebroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ZonkeyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/zonkey.png");
	}
}
