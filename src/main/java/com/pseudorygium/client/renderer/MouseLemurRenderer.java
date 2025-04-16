
package com.pseudorygium.client.renderer;

public class MouseLemurRenderer extends MobRenderer<MouseLemurEntity, LivingEntityRenderState, Modelmouse_lemur> {
	private MouseLemurEntity entity = null;

	public MouseLemurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouse_lemur(context.bakeLayer(Modelmouse_lemur.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MouseLemurEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mouse_lemur.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.45f, 0.45f, 0.45f);
	}
}
