
package com.pseudorygium.client.renderer;

public class EmuRenderer extends MobRenderer<EmuEntity, LivingEntityRenderState, Modelemu> {
	private EmuEntity entity = null;

	public EmuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelemu(context.bakeLayer(Modelemu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EmuEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/emu.png");
	}
}
