
package com.pseudorygium.client.renderer;

public class SmilodonRenderer extends MobRenderer<SmilodonEntity, LivingEntityRenderState, Modelsmilodon> {
	private SmilodonEntity entity = null;

	public SmilodonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsmilodon(context.bakeLayer(Modelsmilodon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmilodonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/smilodon.png");
	}
}
