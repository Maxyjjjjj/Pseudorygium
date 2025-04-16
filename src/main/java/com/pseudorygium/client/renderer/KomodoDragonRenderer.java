
package com.pseudorygium.client.renderer;

public class KomodoDragonRenderer extends MobRenderer<KomodoDragonEntity, LivingEntityRenderState, Modelkomodo_dragon> {
	private KomodoDragonEntity entity = null;

	public KomodoDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkomodo_dragon(context.bakeLayer(Modelkomodo_dragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KomodoDragonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/komodo_dragon.png");
	}
}
