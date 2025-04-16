
package com.pseudorygium.client.renderer;

public class PlatypusRenderer extends MobRenderer<PlatypusEntity, LivingEntityRenderState, Modelplatypus> {
	private PlatypusEntity entity = null;

	public PlatypusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelplatypus(context.bakeLayer(Modelplatypus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PlatypusEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/platypus.png");
	}
}
