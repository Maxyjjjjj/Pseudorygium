
package com.pseudorygium.client.renderer;

public class CoyoteRenderer extends MobRenderer<CoyoteEntity, LivingEntityRenderState, Modelcoyote> {
	private CoyoteEntity entity = null;

	public CoyoteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcoyote(context.bakeLayer(Modelcoyote.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CoyoteEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/eastern-coyote-on-planetminecraft-com.png");
	}
}
