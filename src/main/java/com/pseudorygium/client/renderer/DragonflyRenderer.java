
package com.pseudorygium.client.renderer;

public class DragonflyRenderer extends MobRenderer<DragonflyEntity, LivingEntityRenderState, Modeldragonfly> {
	private DragonflyEntity entity = null;

	public DragonflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragonfly(context.bakeLayer(Modeldragonfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DragonflyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dragonfly.png");
	}
}
