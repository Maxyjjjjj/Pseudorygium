
package com.pseudorygium.client.renderer;

public class RattlesnakeRenderer extends MobRenderer<RattlesnakeEntity, LivingEntityRenderState, Modelrattlesnake> {
	private RattlesnakeEntity entity = null;

	public RattlesnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrattlesnake(context.bakeLayer(Modelrattlesnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(RattlesnakeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rattlesnake.png");
	}
}
