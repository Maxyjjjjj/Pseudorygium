
package com.pseudorygium.client.renderer;

public class YakRenderer extends MobRenderer<YakEntity, LivingEntityRenderState, Modelyak> {
	private YakEntity entity = null;

	public YakRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyak(context.bakeLayer(Modelyak.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(YakEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/yak_black.png");
	}
}
