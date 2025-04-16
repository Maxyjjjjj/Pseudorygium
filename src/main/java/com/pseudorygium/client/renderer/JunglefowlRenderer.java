
package com.pseudorygium.client.renderer;

public class JunglefowlRenderer extends MobRenderer<JunglefowlEntity, LivingEntityRenderState, Modeljunglefowl> {
	private JunglefowlEntity entity = null;

	public JunglefowlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljunglefowl(context.bakeLayer(Modeljunglefowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JunglefowlEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chicken2.png");
	}
}
