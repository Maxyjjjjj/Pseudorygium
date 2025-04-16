
package com.pseudorygium.client.renderer;

public class WolverineRenderer extends MobRenderer<WolverineEntity, LivingEntityRenderState, Modelwolverine> {
	private WolverineEntity entity = null;

	public WolverineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwolverine(context.bakeLayer(Modelwolverine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WolverineEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wolverine.png");
	}
}
