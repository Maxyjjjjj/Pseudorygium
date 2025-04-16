
package com.pseudorygium.client.renderer;

public class BinturongRenderer extends MobRenderer<BinturongEntity, LivingEntityRenderState, Modelbinturong> {
	private BinturongEntity entity = null;

	public BinturongRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbinturong(context.bakeLayer(Modelbinturong.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BinturongEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/binturong.png");
	}
}
