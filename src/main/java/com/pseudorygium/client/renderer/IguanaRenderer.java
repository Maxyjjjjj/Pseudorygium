
package com.pseudorygium.client.renderer;

public class IguanaRenderer extends MobRenderer<IguanaEntity, LivingEntityRenderState, Modeliguana> {
	private IguanaEntity entity = null;

	public IguanaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliguana(context.bakeLayer(Modeliguana.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(IguanaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/iguana.png");
	}
}
