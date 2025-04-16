
package com.pseudorygium.client.renderer;

public class CloudedLeopardRenderer extends MobRenderer<CloudedLeopardEntity, LivingEntityRenderState, Modelclouded_leopard> {
	private CloudedLeopardEntity entity = null;

	public CloudedLeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelclouded_leopard(context.bakeLayer(Modelclouded_leopard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CloudedLeopardEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cloudedleopard.png");
	}
}
