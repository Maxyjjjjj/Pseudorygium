
package com.pseudorygium.client.renderer;

public class LemmingRenderer extends MobRenderer<LemmingEntity, LivingEntityRenderState, Modellemming> {
	private LemmingEntity entity = null;

	public LemmingRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellemming(context.bakeLayer(Modellemming.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LemmingEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lemming.png");
	}
}
