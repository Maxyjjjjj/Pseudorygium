
package com.pseudorygium.client.renderer;

public class PenguinRenderer extends MobRenderer<PenguinEntity, LivingEntityRenderState, Modelpenguin> {
	private PenguinEntity entity = null;

	public PenguinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpenguin(context.bakeLayer(Modelpenguin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PenguinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/penguin.png");
	}
}
