
package com.pseudorygium.client.renderer;

public class PhilippineEagleRenderer extends MobRenderer<PhilippineEagleEntity, LivingEntityRenderState, Modelphilippine_eagle> {
	private PhilippineEagleEntity entity = null;

	public PhilippineEagleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelphilippine_eagle(context.bakeLayer(Modelphilippine_eagle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PhilippineEagleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/philippine_eagle.png");
	}
}
