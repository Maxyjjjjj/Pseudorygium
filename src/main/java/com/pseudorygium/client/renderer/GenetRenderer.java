
package com.pseudorygium.client.renderer;

public class GenetRenderer extends MobRenderer<GenetEntity, LivingEntityRenderState, Modelgenet> {
	private GenetEntity entity = null;

	public GenetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgenet(context.bakeLayer(Modelgenet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GenetEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/genet.png");
	}
}
