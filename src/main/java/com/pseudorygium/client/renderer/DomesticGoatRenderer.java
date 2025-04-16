
package com.pseudorygium.client.renderer;

public class DomesticGoatRenderer extends MobRenderer<DomesticGoatEntity, LivingEntityRenderState, Modeldomestic_goat> {
	private DomesticGoatEntity entity = null;

	public DomesticGoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldomestic_goat(context.bakeLayer(Modeldomestic_goat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DomesticGoatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/domestic_goat_buck.png");
	}
}
