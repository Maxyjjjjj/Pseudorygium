
package com.pseudorygium.client.renderer;

public class MandarinDuckRenderer extends MobRenderer<MandarinDuckEntity, LivingEntityRenderState, Modelmandarin_duck> {
	private MandarinDuckEntity entity = null;

	public MandarinDuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmandarin_duck(context.bakeLayer(Modelmandarin_duck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MandarinDuckEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mandarin_duck.png");
	}
}
