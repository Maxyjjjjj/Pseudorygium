
package com.pseudorygium.client.renderer;

public class EarthwormEntityRenderer extends MobRenderer<EarthwormEntityEntity, LivingEntityRenderState, Modelearthworm> {
	private EarthwormEntityEntity entity = null;

	public EarthwormEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthworm(context.bakeLayer(Modelearthworm.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EarthwormEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/earthworm.png");
	}
}
