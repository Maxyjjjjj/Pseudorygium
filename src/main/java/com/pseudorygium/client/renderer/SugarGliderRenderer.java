
package com.pseudorygium.client.renderer;

public class SugarGliderRenderer extends MobRenderer<SugarGliderEntity, LivingEntityRenderState, Modelflying_squirrel> {
	private SugarGliderEntity entity = null;

	public SugarGliderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflying_squirrel(context.bakeLayer(Modelflying_squirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SugarGliderEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sugar_glider.png");
	}
}
