
package com.pseudorygium.client.renderer;

public class PigeonRenderer extends MobRenderer<PigeonEntity, LivingEntityRenderState, Modelpigeon> {
	private PigeonEntity entity = null;

	public PigeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpigeon(context.bakeLayer(Modelpigeon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PigeonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pigeon.png");
	}
}
