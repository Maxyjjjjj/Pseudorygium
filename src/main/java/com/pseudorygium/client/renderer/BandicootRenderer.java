
package com.pseudorygium.client.renderer;

public class BandicootRenderer extends MobRenderer<BandicootEntity, LivingEntityRenderState, Modelbandicoot> {
	private BandicootEntity entity = null;

	public BandicootRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbandicoot(context.bakeLayer(Modelbandicoot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BandicootEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bandicoot.png");
	}
}
