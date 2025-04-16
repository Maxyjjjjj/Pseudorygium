
package com.pseudorygium.client.renderer;

public class AgamaRenderer extends MobRenderer<AgamaEntity, LivingEntityRenderState, Modelagama> {
	private AgamaEntity entity = null;

	public AgamaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelagama(context.bakeLayer(Modelagama.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AgamaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/agama.png");
	}
}
