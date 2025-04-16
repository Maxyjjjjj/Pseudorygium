
package com.pseudorygium.client.renderer;

public class CapybaraRenderer extends MobRenderer<CapybaraEntity, LivingEntityRenderState, Modelcapybara> {
	private CapybaraEntity entity = null;

	public CapybaraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapybara(context.bakeLayer(Modelcapybara.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CapybaraEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/capybara.png");
	}
}
