
package com.pseudorygium.client.renderer;

public class AardvarkRenderer extends MobRenderer<AardvarkEntity, LivingEntityRenderState, Modelaardvark> {
	private AardvarkEntity entity = null;

	public AardvarkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaardvark(context.bakeLayer(Modelaardvark.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AardvarkEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aardvark.png");
	}
}
