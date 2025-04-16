
package com.pseudorygium.client.renderer;

public class PotooRenderer extends MobRenderer<PotooEntity, LivingEntityRenderState, Modelpotoo> {
	private PotooEntity entity = null;

	public PotooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpotoo(context.bakeLayer(Modelpotoo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PotooEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/potoo.png");
	}
}
