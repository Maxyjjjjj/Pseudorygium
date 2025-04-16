
package com.pseudorygium.client.renderer;

public class PangolinRenderer extends MobRenderer<PangolinEntity, LivingEntityRenderState, Modelpangolin> {
	private PangolinEntity entity = null;

	public PangolinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpangolin(context.bakeLayer(Modelpangolin.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PangolinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pangolin.png");
	}
}
