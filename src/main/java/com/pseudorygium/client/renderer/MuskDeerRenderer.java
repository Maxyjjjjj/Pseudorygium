
package com.pseudorygium.client.renderer;

public class MuskDeerRenderer extends MobRenderer<MuskDeerEntity, LivingEntityRenderState, Modelmusk_deer> {
	private MuskDeerEntity entity = null;

	public MuskDeerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmusk_deer(context.bakeLayer(Modelmusk_deer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MuskDeerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/musk_deer.png");
	}
}
