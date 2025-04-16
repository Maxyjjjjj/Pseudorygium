
package com.pseudorygium.client.renderer;

public class CrocodileRenderer extends MobRenderer<CrocodileEntity, LivingEntityRenderState, Modelcrocodile> {
	private CrocodileEntity entity = null;

	public CrocodileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrocodile(context.bakeLayer(Modelcrocodile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrocodileEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crocodile.png");
	}
}
