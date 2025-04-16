
package com.pseudorygium.client.renderer;

public class MonkeyRenderer extends MobRenderer<MonkeyEntity, LivingEntityRenderState, Modelmonkey> {
	private MonkeyEntity entity = null;

	public MonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonkey(context.bakeLayer(Modelmonkey.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MonkeyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/snub_nosed_monkey.png");
	}
}
