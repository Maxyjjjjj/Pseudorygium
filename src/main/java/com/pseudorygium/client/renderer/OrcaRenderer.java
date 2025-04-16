
package com.pseudorygium.client.renderer;

public class OrcaRenderer extends MobRenderer<OrcaEntity, LivingEntityRenderState, Modelorca> {
	private OrcaEntity entity = null;

	public OrcaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorca(context.bakeLayer(Modelorca.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OrcaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/orca.png");
	}
}
