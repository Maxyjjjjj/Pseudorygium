
package com.pseudorygium.client.renderer;

public class WoodpeckerRenderer extends MobRenderer<WoodpeckerEntity, LivingEntityRenderState, Modelwoodpecker> {
	private WoodpeckerEntity entity = null;

	public WoodpeckerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwoodpecker(context.bakeLayer(Modelwoodpecker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WoodpeckerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/woodpecker_spotted.png");
	}
}
