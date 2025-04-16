
package com.pseudorygium.client.renderer;

public class HyenaRenderer extends MobRenderer<HyenaEntity, LivingEntityRenderState, Modelhyena> {
	private HyenaEntity entity = null;

	public HyenaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhyena(context.bakeLayer(Modelhyena.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HyenaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hyena.png");
	}
}
