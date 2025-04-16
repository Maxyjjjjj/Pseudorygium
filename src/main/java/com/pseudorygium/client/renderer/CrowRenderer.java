
package com.pseudorygium.client.renderer;

public class CrowRenderer extends MobRenderer<CrowEntity, LivingEntityRenderState, Modelcorvid> {
	private CrowEntity entity = null;

	public CrowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvid(context.bakeLayer(Modelcorvid.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrowEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crow_hooded.png");
	}
}
