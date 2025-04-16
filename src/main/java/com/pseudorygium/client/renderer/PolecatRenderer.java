
package com.pseudorygium.client.renderer;

public class PolecatRenderer extends MobRenderer<PolecatEntity, LivingEntityRenderState, Modelferret> {
	private PolecatEntity entity = null;

	public PolecatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelferret(context.bakeLayer(Modelferret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PolecatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/polecat.png");
	}
}
