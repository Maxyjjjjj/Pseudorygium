
package com.pseudorygium.client.renderer;

public class GerenukRenderer extends MobRenderer<GerenukEntity, LivingEntityRenderState, Modelgerenuk> {
	private GerenukEntity entity = null;

	public GerenukRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgerenuk(context.bakeLayer(Modelgerenuk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GerenukEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gerenuk.png");
	}
}
