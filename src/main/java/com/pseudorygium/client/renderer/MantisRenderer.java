
package com.pseudorygium.client.renderer;

public class MantisRenderer extends MobRenderer<MantisEntity, LivingEntityRenderState, Modelmantis> {
	private MantisEntity entity = null;

	public MantisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmantis(context.bakeLayer(Modelmantis.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MantisEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mantis.png");
	}
}
