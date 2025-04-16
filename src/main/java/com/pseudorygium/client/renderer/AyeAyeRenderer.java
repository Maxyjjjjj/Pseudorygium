
package com.pseudorygium.client.renderer;

public class AyeAyeRenderer extends MobRenderer<AyeAyeEntity, LivingEntityRenderState, Modelaye_aye> {
	private AyeAyeEntity entity = null;

	public AyeAyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaye_aye(context.bakeLayer(Modelaye_aye.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AyeAyeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aye-aye.png");
	}
}
