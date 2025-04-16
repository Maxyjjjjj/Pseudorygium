
package com.pseudorygium.client.renderer;

public class BongoRenderer extends MobRenderer<BongoEntity, LivingEntityRenderState, Modelbongo> {
	private BongoEntity entity = null;

	public BongoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbongo(context.bakeLayer(Modelbongo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BongoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bongo_antelope_1.png");
	}
}
