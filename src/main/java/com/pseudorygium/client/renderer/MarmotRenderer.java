
package com.pseudorygium.client.renderer;

public class MarmotRenderer extends MobRenderer<MarmotEntity, LivingEntityRenderState, Modelmarmot> {
	private MarmotEntity entity = null;

	public MarmotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarmot(context.bakeLayer(Modelmarmot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MarmotEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/marmot.png");
	}
}
