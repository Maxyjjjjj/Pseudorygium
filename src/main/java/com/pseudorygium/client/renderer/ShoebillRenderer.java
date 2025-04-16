
package com.pseudorygium.client.renderer;

public class ShoebillRenderer extends MobRenderer<ShoebillEntity, LivingEntityRenderState, Modelshoebill> {
	private ShoebillEntity entity = null;

	public ShoebillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshoebill(context.bakeLayer(Modelshoebill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ShoebillEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/shoebill.png");
	}
}
