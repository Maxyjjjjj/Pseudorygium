
package com.pseudorygium.client.renderer;

public class HoopoeRenderer extends MobRenderer<HoopoeEntity, LivingEntityRenderState, Modelhoopoe> {
	private HoopoeEntity entity = null;

	public HoopoeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoopoe(context.bakeLayer(Modelhoopoe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HoopoeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hoopoe.png");
	}
}
