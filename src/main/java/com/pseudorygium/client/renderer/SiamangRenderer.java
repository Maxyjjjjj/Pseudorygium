
package com.pseudorygium.client.renderer;

public class SiamangRenderer extends MobRenderer<SiamangEntity, LivingEntityRenderState, Modelsiamang> {
	private SiamangEntity entity = null;

	public SiamangRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsiamang(context.bakeLayer(Modelsiamang.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SiamangEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/siamang.png");
	}
}
