
package com.pseudorygium.client.renderer;

public class CheetahRenderer extends MobRenderer<CheetahEntity, LivingEntityRenderState, Modelcheetah> {
	private CheetahEntity entity = null;

	public CheetahRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcheetah(context.bakeLayer(Modelcheetah.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CheetahEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cheetah.png");
	}
}
