
package com.pseudorygium.client.renderer;

public class SawfishRenderer extends MobRenderer<SawfishEntity, LivingEntityRenderState, Modelsawfish> {
	private SawfishEntity entity = null;

	public SawfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsawfish(context.bakeLayer(Modelsawfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SawfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sawfish.png");
	}
}
