
package com.pseudorygium.client.renderer;

public class MarsupialLionRenderer extends MobRenderer<MarsupialLionEntity, LivingEntityRenderState, Modelmarsupial_lion> {
	private MarsupialLionEntity entity = null;

	public MarsupialLionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarsupial_lion(context.bakeLayer(Modelmarsupial_lion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MarsupialLionEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/marsupial_lion.png");
	}
}
