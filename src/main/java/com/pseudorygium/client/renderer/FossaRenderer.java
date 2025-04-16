
package com.pseudorygium.client.renderer;

public class FossaRenderer extends MobRenderer<FossaEntity, LivingEntityRenderState, Modelfossa> {
	private FossaEntity entity = null;

	public FossaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfossa(context.bakeLayer(Modelfossa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FossaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fossa.png");
	}
}
