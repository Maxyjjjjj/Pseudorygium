
package com.pseudorygium.client.renderer;

public class KaguRenderer extends MobRenderer<KaguEntity, LivingEntityRenderState, Modelkagu> {
	private KaguEntity entity = null;

	public KaguRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkagu(context.bakeLayer(Modelkagu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KaguEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kagu.png");
	}
}
