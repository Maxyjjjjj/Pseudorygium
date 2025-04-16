
package com.pseudorygium.client.renderer;

public class MohoRenderer extends MobRenderer<MohoEntity, LivingEntityRenderState, Modelmoho> {
	private MohoEntity entity = null;

	public MohoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoho(context.bakeLayer(Modelmoho.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MohoEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/moho.png");
	}
}
