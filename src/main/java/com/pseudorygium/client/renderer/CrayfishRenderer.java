
package com.pseudorygium.client.renderer;

public class CrayfishRenderer extends MobRenderer<CrayfishEntity, LivingEntityRenderState, Modelcrayfish> {
	private CrayfishEntity entity = null;

	public CrayfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrayfish(context.bakeLayer(Modelcrayfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrayfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crayfish.png");
	}
}
