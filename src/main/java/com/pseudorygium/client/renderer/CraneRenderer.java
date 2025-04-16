
package com.pseudorygium.client.renderer;

public class CraneRenderer extends MobRenderer<CraneEntity, LivingEntityRenderState, Modelcrane> {
	private CraneEntity entity = null;

	public CraneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrane(context.bakeLayer(Modelcrane.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CraneEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crane_common.png");
	}
}
