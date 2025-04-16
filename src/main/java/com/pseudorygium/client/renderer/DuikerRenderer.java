
package com.pseudorygium.client.renderer;

public class DuikerRenderer extends MobRenderer<DuikerEntity, LivingEntityRenderState, Modelduiker> {
	private DuikerEntity entity = null;

	public DuikerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduiker(context.bakeLayer(Modelduiker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DuikerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/duiker.png");
	}
}
