
package com.pseudorygium.client.renderer;

public class WombatRenderer extends MobRenderer<WombatEntity, LivingEntityRenderState, Modelwombat> {
	private WombatEntity entity = null;

	public WombatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwombat(context.bakeLayer(Modelwombat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WombatEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wombat.png");
	}
}
