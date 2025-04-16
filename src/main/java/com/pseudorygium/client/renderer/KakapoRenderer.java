
package com.pseudorygium.client.renderer;

public class KakapoRenderer extends MobRenderer<KakapoEntity, LivingEntityRenderState, Modelkakapo> {
	private KakapoEntity entity = null;

	public KakapoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkakapo(context.bakeLayer(Modelkakapo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KakapoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kakapo.png");
	}
}
