
package com.pseudorygium.client.renderer;

public class MeerkatRenderer extends MobRenderer<MeerkatEntity, LivingEntityRenderState, Modelmeerkat> {
	private MeerkatEntity entity = null;

	public MeerkatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmeerkat(context.bakeLayer(Modelmeerkat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MeerkatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/meerkat.png");
	}
}
