
package com.pseudorygium.client.renderer;

public class BlueWhaleRenderer extends MobRenderer<BlueWhaleEntity, LivingEntityRenderState, Modelblue_whale> {
	private BlueWhaleEntity entity = null;

	public BlueWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_whale(context.bakeLayer(Modelblue_whale.LAYER_LOCATION)), 6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlueWhaleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/blue_whale.png");
	}
}
