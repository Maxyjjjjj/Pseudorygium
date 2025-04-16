
package com.pseudorygium.client.renderer;

public class AnoleRenderer extends MobRenderer<AnoleEntity, LivingEntityRenderState, Modelanole> {
	private AnoleEntity entity = null;

	public AnoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanole(context.bakeLayer(Modelanole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AnoleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/anole.png");
	}
}
