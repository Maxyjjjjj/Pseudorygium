
package com.pseudorygium.client.renderer;

public class SaigaRenderer extends MobRenderer<SaigaEntity, LivingEntityRenderState, Modelsaiga> {
	private SaigaEntity entity = null;

	public SaigaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaiga(context.bakeLayer(Modelsaiga.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SaigaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/saiga.png");
	}
}
