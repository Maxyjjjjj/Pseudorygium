
package com.pseudorygium.client.renderer;

public class TenrecRenderer extends MobRenderer<TenrecEntity, LivingEntityRenderState, Modeltenrec> {
	private TenrecEntity entity = null;

	public TenrecRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltenrec(context.bakeLayer(Modeltenrec.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TenrecEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tenrec.png");
	}
}
