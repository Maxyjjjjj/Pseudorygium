
package com.pseudorygium.client.renderer;

public class MongooseRenderer extends MobRenderer<MongooseEntity, LivingEntityRenderState, Modelmongoose> {
	private MongooseEntity entity = null;

	public MongooseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmongoose(context.bakeLayer(Modelmongoose.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MongooseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mongoose.png");
	}
}
