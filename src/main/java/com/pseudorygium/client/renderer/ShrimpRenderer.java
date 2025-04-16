
package com.pseudorygium.client.renderer;

public class ShrimpRenderer extends MobRenderer<ShrimpEntity, LivingEntityRenderState, Modelshrimp> {
	private ShrimpEntity entity = null;

	public ShrimpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshrimp(context.bakeLayer(Modelshrimp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ShrimpEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/shrimp.png");
	}
}
