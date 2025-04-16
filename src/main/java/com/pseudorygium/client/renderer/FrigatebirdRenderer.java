
package com.pseudorygium.client.renderer;

public class FrigatebirdRenderer extends MobRenderer<FrigatebirdEntity, LivingEntityRenderState, Modelfrigatebird> {
	private FrigatebirdEntity entity = null;

	public FrigatebirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrigatebird(context.bakeLayer(Modelfrigatebird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FrigatebirdEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/frigatebird.png");
	}
}
