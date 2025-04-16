
package com.pseudorygium.client.renderer;

public class WildBoarRenderer extends MobRenderer<WildBoarEntity, LivingEntityRenderState, Modelwild_boar> {
	private WildBoarEntity entity = null;

	public WildBoarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwild_boar(context.bakeLayer(Modelwild_boar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WildBoarEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wild_boar.png");
	}
}
