
package com.pseudorygium.client.renderer;

public class RhinocerosRenderer extends MobRenderer<RhinocerosEntity, LivingEntityRenderState, Modelrhinoceros> {
	private RhinocerosEntity entity = null;

	public RhinocerosRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrhinoceros(context.bakeLayer(Modelrhinoceros.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RhinocerosEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rhinoceros.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}
}
