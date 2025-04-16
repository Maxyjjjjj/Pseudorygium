
package com.pseudorygium.client.renderer;

public class JumpingSpiderRenderer extends MobRenderer<JumpingSpiderEntity, LivingEntityRenderState, Modeljumping_spider> {
	private JumpingSpiderEntity entity = null;

	public JumpingSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljumping_spider(context.bakeLayer(Modeljumping_spider.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JumpingSpiderEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jumping_spider.png");
	}
}
