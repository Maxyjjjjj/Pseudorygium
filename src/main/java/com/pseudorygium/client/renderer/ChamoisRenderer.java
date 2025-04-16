
package com.pseudorygium.client.renderer;

public class ChamoisRenderer extends MobRenderer<ChamoisEntity, LivingEntityRenderState, Modelchamois> {
	private ChamoisEntity entity = null;

	public ChamoisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchamois(context.bakeLayer(Modelchamois.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChamoisEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chamois.png");
	}
}
