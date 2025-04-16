
package com.pseudorygium.client.renderer;

public class PheasantRenderer extends MobRenderer<PheasantEntity, LivingEntityRenderState, Modelpheasant> {
	private PheasantEntity entity = null;

	public PheasantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpheasant(context.bakeLayer(Modelpheasant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PheasantEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pheasant.png");
	}
}
