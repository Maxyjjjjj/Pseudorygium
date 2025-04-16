
package com.pseudorygium.client.renderer;

public class ChiruRenderer extends MobRenderer<ChiruEntity, LivingEntityRenderState, Modelchiru> {
	private ChiruEntity entity = null;

	public ChiruRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchiru(context.bakeLayer(Modelchiru.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChiruEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chiru.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.75f, 0.75f, 0.75f);
	}
}
