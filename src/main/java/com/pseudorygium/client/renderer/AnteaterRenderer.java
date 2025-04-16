
package com.pseudorygium.client.renderer;

public class AnteaterRenderer extends MobRenderer<AnteaterEntity, LivingEntityRenderState, Modelanteater> {
	private AnteaterEntity entity = null;

	public AnteaterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanteater(context.bakeLayer(Modelanteater.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AnteaterEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/anteater.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}
}
