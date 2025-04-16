
package com.pseudorygium.client.renderer;

public class WalrusRenderer extends MobRenderer<WalrusEntity, LivingEntityRenderState, Modelwalrus> {
	private WalrusEntity entity = null;

	public WalrusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwalrus(context.bakeLayer(Modelwalrus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WalrusEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/walrus.png");
	}
}
