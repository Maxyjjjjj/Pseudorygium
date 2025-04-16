
package com.pseudorygium.client.renderer;

public class StagBeetleRenderer extends MobRenderer<StagBeetleEntity, LivingEntityRenderState, Modelstag_beetle> {
	private StagBeetleEntity entity = null;

	public StagBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstag_beetle(context.bakeLayer(Modelstag_beetle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StagBeetleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/stag_beetle.png");
	}
}
