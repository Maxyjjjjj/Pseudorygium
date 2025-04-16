
package com.pseudorygium.client.renderer;

public class KoalaRenderer extends MobRenderer<KoalaEntity, LivingEntityRenderState, Modelkoala> {
	private KoalaEntity entity = null;

	public KoalaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkoala(context.bakeLayer(Modelkoala.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KoalaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/koala.png");
	}
}
