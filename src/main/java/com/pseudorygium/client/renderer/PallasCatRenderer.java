
package com.pseudorygium.client.renderer;

public class PallasCatRenderer extends MobRenderer<PallasCatEntity, LivingEntityRenderState, Modelpallas_cat> {
	private PallasCatEntity entity = null;

	public PallasCatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpallas_cat(context.bakeLayer(Modelpallas_cat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PallasCatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/allasat.png");
	}
}
