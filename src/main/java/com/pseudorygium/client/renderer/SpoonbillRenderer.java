
package com.pseudorygium.client.renderer;

public class SpoonbillRenderer extends MobRenderer<SpoonbillEntity, LivingEntityRenderState, Modelspoonbill> {
	private SpoonbillEntity entity = null;

	public SpoonbillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspoonbill(context.bakeLayer(Modelspoonbill.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SpoonbillEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/spoonbill.png");
	}
}
