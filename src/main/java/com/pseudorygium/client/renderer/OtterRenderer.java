
package com.pseudorygium.client.renderer;

public class OtterRenderer extends MobRenderer<OtterEntity, LivingEntityRenderState, Modelotter> {
	private OtterEntity entity = null;

	public OtterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelotter(context.bakeLayer(Modelotter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OtterEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/otter.png");
	}
}
