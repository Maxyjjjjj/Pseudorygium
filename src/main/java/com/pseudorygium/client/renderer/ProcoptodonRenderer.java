
package com.pseudorygium.client.renderer;

public class ProcoptodonRenderer extends MobRenderer<ProcoptodonEntity, LivingEntityRenderState, Modelprocoptodon> {
	private ProcoptodonEntity entity = null;

	public ProcoptodonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprocoptodon(context.bakeLayer(Modelprocoptodon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ProcoptodonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/procoptodon.png");
	}
}
