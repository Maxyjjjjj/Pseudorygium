
package com.pseudorygium.client.renderer;

public class KangarooRenderer extends MobRenderer<KangarooEntity, LivingEntityRenderState, Modelkangaroo> {
	private KangarooEntity entity = null;

	public KangarooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkangaroo(context.bakeLayer(Modelkangaroo.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(KangarooEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kangaroo.png");
	}
}
