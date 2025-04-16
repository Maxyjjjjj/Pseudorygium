
package com.pseudorygium.client.renderer;

public class NumbatRenderer extends MobRenderer<NumbatEntity, LivingEntityRenderState, Modelnumbat> {
	private NumbatEntity entity = null;

	public NumbatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnumbat(context.bakeLayer(Modelnumbat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NumbatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/numbat.png");
	}
}
