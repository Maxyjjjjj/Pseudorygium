
package com.pseudorygium.client.renderer;

public class FlyingSquirrelRenderer extends MobRenderer<FlyingSquirrelEntity, LivingEntityRenderState, Modelflying_squirrel> {
	private FlyingSquirrelEntity entity = null;

	public FlyingSquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflying_squirrel(context.bakeLayer(Modelflying_squirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(FlyingSquirrelEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/flying_squirrel.png");
	}
}
