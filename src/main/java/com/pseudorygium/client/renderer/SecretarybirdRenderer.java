
package com.pseudorygium.client.renderer;

public class SecretarybirdRenderer extends MobRenderer<SecretarybirdEntity, LivingEntityRenderState, Modelsecretarybird> {
	private SecretarybirdEntity entity = null;

	public SecretarybirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsecretarybird(context.bakeLayer(Modelsecretarybird.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SecretarybirdEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/secretary_bird.png");
	}
}
