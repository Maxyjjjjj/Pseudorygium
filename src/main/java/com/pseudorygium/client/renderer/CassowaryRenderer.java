
package com.pseudorygium.client.renderer;

public class CassowaryRenderer extends MobRenderer<CassowaryEntity, LivingEntityRenderState, Modelcassowary> {
	private CassowaryEntity entity = null;

	public CassowaryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcassowary(context.bakeLayer(Modelcassowary.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CassowaryEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cassowary.png");
	}
}
