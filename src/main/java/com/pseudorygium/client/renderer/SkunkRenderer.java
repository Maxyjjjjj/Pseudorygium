
package com.pseudorygium.client.renderer;

public class SkunkRenderer extends MobRenderer<SkunkEntity, LivingEntityRenderState, Modelskunk> {
	private SkunkEntity entity = null;

	public SkunkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelskunk(context.bakeLayer(Modelskunk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SkunkEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/skunk.png");
	}
}
