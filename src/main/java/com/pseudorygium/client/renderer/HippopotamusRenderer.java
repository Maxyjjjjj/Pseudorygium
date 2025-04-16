
package com.pseudorygium.client.renderer;

public class HippopotamusRenderer extends MobRenderer<HippopotamusEntity, LivingEntityRenderState, Modelhippopotamus> {
	private HippopotamusEntity entity = null;

	public HippopotamusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhippopotamus(context.bakeLayer(Modelhippopotamus.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HippopotamusEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hippopotamus.png");
	}
}
