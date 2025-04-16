
package com.pseudorygium.client.renderer;

public class SitatungaRenderer extends MobRenderer<SitatungaEntity, LivingEntityRenderState, Modelsitatunga> {
	private SitatungaEntity entity = null;

	public SitatungaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsitatunga(context.bakeLayer(Modelsitatunga.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SitatungaEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sitatunga.png");
	}
}
