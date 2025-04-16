
package com.pseudorygium.client.renderer;

public class FerretRenderer extends MobRenderer<FerretEntity, LivingEntityRenderState, Modelferret> {
	private FerretEntity entity = null;

	public FerretRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelferret(context.bakeLayer(Modelferret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FerretEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ferret.png");
	}
}
