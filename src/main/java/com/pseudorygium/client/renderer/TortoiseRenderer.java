
package com.pseudorygium.client.renderer;

public class TortoiseRenderer extends MobRenderer<TortoiseEntity, LivingEntityRenderState, Modeltortoise> {
	private TortoiseEntity entity = null;

	public TortoiseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltortoise(context.bakeLayer(Modeltortoise.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TortoiseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tortoise.png");
	}
}
