
package com.pseudorygium.client.renderer;

public class DodoRenderer extends MobRenderer<DodoEntity, LivingEntityRenderState, Modeldodo> {
	private DodoEntity entity = null;

	public DodoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldodo(context.bakeLayer(Modeldodo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DodoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dodo.png");
	}
}
