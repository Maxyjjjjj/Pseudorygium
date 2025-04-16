
package com.pseudorygium.client.renderer;

public class BelugaSturgeonRenderer extends MobRenderer<BelugaSturgeonEntity, LivingEntityRenderState, Modelbeluga_sturgeon> {
	private BelugaSturgeonEntity entity = null;

	public BelugaSturgeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeluga_sturgeon(context.bakeLayer(Modelbeluga_sturgeon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BelugaSturgeonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/beluga_sturgeon.png");
	}
}
