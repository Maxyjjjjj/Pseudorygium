
package com.pseudorygium.client.renderer;

public class JayRenderer extends MobRenderer<JayEntity, LivingEntityRenderState, Modeljay> {
	private JayEntity entity = null;

	public JayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljay(context.bakeLayer(Modeljay.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JayEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jay_eurasian.png");
	}
}
