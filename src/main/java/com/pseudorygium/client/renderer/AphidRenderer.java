
package com.pseudorygium.client.renderer;

public class AphidRenderer extends MobRenderer<AphidEntity, LivingEntityRenderState, Modelaphid> {
	private AphidEntity entity = null;

	public AphidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaphid(context.bakeLayer(Modelaphid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AphidEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aphid.png");
	}
}
