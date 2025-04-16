
package com.pseudorygium.client.renderer;

public class NakedMoleRatRenderer extends MobRenderer<NakedMoleRatEntity, LivingEntityRenderState, Modelnaked_mole_rat> {
	private NakedMoleRatEntity entity = null;

	public NakedMoleRatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnaked_mole_rat(context.bakeLayer(Modelnaked_mole_rat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NakedMoleRatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/naked_mole_rat.png");
	}
}
