
package com.pseudorygium.client.renderer;

public class OrangutanRenderer extends MobRenderer<OrangutanEntity, LivingEntityRenderState, Modelorangutan> {
	private OrangutanEntity entity = null;

	public OrangutanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorangutan(context.bakeLayer(Modelorangutan.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OrangutanEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/orangutan.png");
	}
}
