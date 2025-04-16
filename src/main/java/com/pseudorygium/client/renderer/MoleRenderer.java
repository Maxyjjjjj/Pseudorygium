
package com.pseudorygium.client.renderer;

public class MoleRenderer extends MobRenderer<MoleEntity, LivingEntityRenderState, Modelmole> {
	private MoleEntity entity = null;

	public MoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmole(context.bakeLayer(Modelmole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MoleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mole.png");
	}
}
