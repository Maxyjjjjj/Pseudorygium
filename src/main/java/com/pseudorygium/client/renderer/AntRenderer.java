
package com.pseudorygium.client.renderer;

public class AntRenderer extends MobRenderer<AntEntity, LivingEntityRenderState, Modelant> {
	private AntEntity entity = null;

	public AntRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelant(context.bakeLayer(Modelant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AntEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ant.png");
	}
}
