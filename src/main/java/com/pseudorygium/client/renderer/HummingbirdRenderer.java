
package com.pseudorygium.client.renderer;

public class HummingbirdRenderer extends MobRenderer<HummingbirdEntity, LivingEntityRenderState, Modelhummingbird> {
	private HummingbirdEntity entity = null;

	public HummingbirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhummingbird(context.bakeLayer(Modelhummingbird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HummingbirdEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hummingbird.png");
	}
}
