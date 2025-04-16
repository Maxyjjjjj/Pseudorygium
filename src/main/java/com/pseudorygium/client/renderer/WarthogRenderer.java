
package com.pseudorygium.client.renderer;

public class WarthogRenderer extends MobRenderer<WarthogEntity, LivingEntityRenderState, Modelwarthog> {
	private WarthogEntity entity = null;

	public WarthogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwarthog(context.bakeLayer(Modelwarthog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WarthogEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/warthog.png");
	}
}
