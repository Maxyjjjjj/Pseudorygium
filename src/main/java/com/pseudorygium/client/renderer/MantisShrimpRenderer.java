
package com.pseudorygium.client.renderer;

public class MantisShrimpRenderer extends MobRenderer<MantisShrimpEntity, LivingEntityRenderState, Modelmantis_shrimp> {
	private MantisShrimpEntity entity = null;

	public MantisShrimpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmantis_shrimp(context.bakeLayer(Modelmantis_shrimp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MantisShrimpEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mantis_shrimp.png");
	}
}
