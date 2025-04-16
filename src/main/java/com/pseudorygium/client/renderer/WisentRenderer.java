
package com.pseudorygium.client.renderer;

public class WisentRenderer extends MobRenderer<WisentEntity, LivingEntityRenderState, Modelwisent> {
	private WisentEntity entity = null;

	public WisentRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisent(context.bakeLayer(Modelwisent.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WisentEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wisent.png");
	}
}
