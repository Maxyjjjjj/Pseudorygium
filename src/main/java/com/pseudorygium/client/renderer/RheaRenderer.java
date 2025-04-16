
package com.pseudorygium.client.renderer;

public class RheaRenderer extends MobRenderer<RheaEntity, LivingEntityRenderState, Modelrhea> {
	private RheaEntity entity = null;

	public RheaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrhea(context.bakeLayer(Modelrhea.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RheaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rhea.png");
	}
}
