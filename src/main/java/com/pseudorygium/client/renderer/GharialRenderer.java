
package com.pseudorygium.client.renderer;

public class GharialRenderer extends MobRenderer<GharialEntity, LivingEntityRenderState, Modelgharial> {
	private GharialEntity entity = null;

	public GharialRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgharial(context.bakeLayer(Modelgharial.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GharialEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gharial.png");
	}
}
