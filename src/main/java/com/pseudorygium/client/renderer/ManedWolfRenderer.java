
package com.pseudorygium.client.renderer;

public class ManedWolfRenderer extends MobRenderer<ManedWolfEntity, LivingEntityRenderState, Modelmaned_wolf> {
	private ManedWolfEntity entity = null;

	public ManedWolfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaned_wolf(context.bakeLayer(Modelmaned_wolf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ManedWolfEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/maned_wolf.png");
	}
}
