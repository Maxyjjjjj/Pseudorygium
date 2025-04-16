
package com.pseudorygium.client.renderer;

public class JerboaRenderer extends MobRenderer<JerboaEntity, LivingEntityRenderState, Modeljerboa> {
	private JerboaEntity entity = null;

	public JerboaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljerboa(context.bakeLayer(Modeljerboa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JerboaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jerboa.png");
	}
}
