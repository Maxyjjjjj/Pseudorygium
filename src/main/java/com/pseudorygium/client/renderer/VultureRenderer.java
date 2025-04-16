
package com.pseudorygium.client.renderer;

public class VultureRenderer extends MobRenderer<VultureEntity, LivingEntityRenderState, Modelvulture> {
	private VultureEntity entity = null;

	public VultureRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvulture(context.bakeLayer(Modelvulture.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(VultureEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/vulture.png");
	}
}
