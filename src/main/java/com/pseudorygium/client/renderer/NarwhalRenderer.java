
package com.pseudorygium.client.renderer;

public class NarwhalRenderer extends MobRenderer<NarwhalEntity, LivingEntityRenderState, Modelnarwhal> {
	private NarwhalEntity entity = null;

	public NarwhalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnarwhal(context.bakeLayer(Modelnarwhal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NarwhalEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/narwhal.png");
	}
}
