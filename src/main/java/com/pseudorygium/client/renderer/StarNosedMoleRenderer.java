
package com.pseudorygium.client.renderer;

public class StarNosedMoleRenderer extends MobRenderer<StarNosedMoleEntity, LivingEntityRenderState, Modelstar_nased_mole> {
	private StarNosedMoleEntity entity = null;

	public StarNosedMoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstar_nased_mole(context.bakeLayer(Modelstar_nased_mole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StarNosedMoleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/star_nosed_mole.png");
	}
}
