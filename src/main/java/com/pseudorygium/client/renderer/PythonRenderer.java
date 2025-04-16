
package com.pseudorygium.client.renderer;

public class PythonRenderer extends MobRenderer<PythonEntity, LivingEntityRenderState, Modelpython> {
	private PythonEntity entity = null;

	public PythonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpython(context.bakeLayer(Modelpython.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PythonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/python.png");
	}
}
