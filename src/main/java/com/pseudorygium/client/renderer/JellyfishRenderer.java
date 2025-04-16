
package com.pseudorygium.client.renderer;

public class JellyfishRenderer extends MobRenderer<JellyfishEntity, LivingEntityRenderState, Modeljellyfish> {
	private JellyfishEntity entity = null;

	public JellyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljellyfish(context.bakeLayer(Modeljellyfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JellyfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jellyfish_pink.png");
	}
}
