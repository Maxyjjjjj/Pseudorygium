
package com.pseudorygium.client.renderer;

public class OliveBaboonRenderer extends MobRenderer<OliveBaboonEntity, LivingEntityRenderState, Modelbaboon> {
	private OliveBaboonEntity entity = null;

	public OliveBaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaboon(context.bakeLayer(Modelbaboon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OliveBaboonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/olive_baboon.png");
	}
}
