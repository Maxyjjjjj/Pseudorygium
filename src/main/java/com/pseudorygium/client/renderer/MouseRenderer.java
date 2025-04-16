
package com.pseudorygium.client.renderer;

public class MouseRenderer extends MobRenderer<MouseEntity, LivingEntityRenderState, Modelmouse> {
	private MouseEntity entity = null;

	public MouseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouse(context.bakeLayer(Modelmouse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MouseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mouse_grey.png");
	}
}
