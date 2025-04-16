
package com.pseudorygium.client.renderer;

public class SheltopusikRenderer extends MobRenderer<SheltopusikEntity, LivingEntityRenderState, Modelsheltopusik> {
	private SheltopusikEntity entity = null;

	public SheltopusikRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsheltopusik(context.bakeLayer(Modelsheltopusik.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SheltopusikEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sheltopusik.png");
	}
}
