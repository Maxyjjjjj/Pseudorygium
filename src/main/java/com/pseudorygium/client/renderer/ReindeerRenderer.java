
package com.pseudorygium.client.renderer;

public class ReindeerRenderer extends MobRenderer<ReindeerEntity, LivingEntityRenderState, Modelreindeer> {
	private ReindeerEntity entity = null;

	public ReindeerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreindeer(context.bakeLayer(Modelreindeer.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ReindeerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/reindeer.png");
	}
}
