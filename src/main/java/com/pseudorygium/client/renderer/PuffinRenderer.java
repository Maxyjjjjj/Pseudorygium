
package com.pseudorygium.client.renderer;

public class PuffinRenderer extends MobRenderer<PuffinEntity, LivingEntityRenderState, Modelpuffin> {
	private PuffinEntity entity = null;

	public PuffinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuffin(context.bakeLayer(Modelpuffin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PuffinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/puffin.png");
	}
}
