
package com.pseudorygium.client.renderer;

public class RedPandaRenderer extends MobRenderer<RedPandaEntity, LivingEntityRenderState, Modelred_panda> {
	private RedPandaEntity entity = null;

	public RedPandaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelred_panda(context.bakeLayer(Modelred_panda.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RedPandaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/red_panda.png");
	}
}
