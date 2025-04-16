
package com.pseudorygium.client.renderer;

public class ManateeRenderer extends MobRenderer<ManateeEntity, LivingEntityRenderState, Modelmanatee> {
	private ManateeEntity entity = null;

	public ManateeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmanatee(context.bakeLayer(Modelmanatee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ManateeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/manatee.png");
	}
}
