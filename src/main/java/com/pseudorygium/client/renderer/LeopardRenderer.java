
package com.pseudorygium.client.renderer;

public class LeopardRenderer extends MobRenderer<LeopardEntity, LivingEntityRenderState, Modelleopard> {
	private LeopardEntity entity = null;

	public LeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelleopard(context.bakeLayer(Modelleopard.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LeopardEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/leopard_regular.png");
	}
}
