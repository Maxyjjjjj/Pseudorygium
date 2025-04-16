
package com.pseudorygium.client.renderer;

public class TigerRenderer extends MobRenderer<TigerEntity, LivingEntityRenderState, Modeltiger> {
	private TigerEntity entity = null;

	public TigerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltiger(context.bakeLayer(Modeltiger.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TigerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tiger_wild.png");
	}
}
