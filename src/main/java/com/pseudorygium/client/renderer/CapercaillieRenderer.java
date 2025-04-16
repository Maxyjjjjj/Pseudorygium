
package com.pseudorygium.client.renderer;

public class CapercaillieRenderer extends MobRenderer<CapercaillieEntity, LivingEntityRenderState, Modelcapercaillie> {
	private CapercaillieEntity entity = null;

	public CapercaillieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapercaillie(context.bakeLayer(Modelcapercaillie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CapercaillieEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/capercaillie.png");
	}
}
