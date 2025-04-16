
package com.pseudorygium.client.renderer;

public class OkapiRenderer extends MobRenderer<OkapiEntity, LivingEntityRenderState, Modelokapi> {
	private OkapiEntity entity = null;

	public OkapiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelokapi(context.bakeLayer(Modelokapi.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OkapiEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/okapi.png");
	}
}
