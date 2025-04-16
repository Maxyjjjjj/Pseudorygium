
package com.pseudorygium.client.renderer;

public class PtarmiganRenderer extends MobRenderer<PtarmiganEntity, LivingEntityRenderState, Modelptarmigan> {
	private PtarmiganEntity entity = null;

	public PtarmiganRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelptarmigan(context.bakeLayer(Modelptarmigan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PtarmiganEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ptarmigan_winter.png");
	}
}
