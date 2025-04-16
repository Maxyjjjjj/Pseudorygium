
package com.pseudorygium.client.renderer;

public class GibbonRenderer extends MobRenderer<GibbonEntity, LivingEntityRenderState, Modelgibbon> {
	private GibbonEntity entity = null;

	public GibbonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgibbon(context.bakeLayer(Modelgibbon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GibbonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gibbonblack.png");
	}
}
