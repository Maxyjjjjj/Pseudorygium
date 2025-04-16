
package com.pseudorygium.client.renderer;

public class DuckRenderer extends MobRenderer<DuckEntity, LivingEntityRenderState, Modelduck> {
	private DuckEntity entity = null;

	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck(context.bakeLayer(Modelduck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DuckEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mallard-duck-on-planetminecraft-com.png");
	}
}
