
package com.pseudorygium.client.renderer;

public class SnowyOwlRenderer extends MobRenderer<SnowyOwlEntity, LivingEntityRenderState, Modelowl> {
	private SnowyOwlEntity entity = null;

	public SnowyOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelowl(context.bakeLayer(Modelowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SnowyOwlEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/owl_snowy.png");
	}
}
