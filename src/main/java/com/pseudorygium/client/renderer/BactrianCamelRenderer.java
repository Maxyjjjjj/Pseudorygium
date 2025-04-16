
package com.pseudorygium.client.renderer;

public class BactrianCamelRenderer extends MobRenderer<BactrianCamelEntity, LivingEntityRenderState, Modelbactrian_camel> {
	private BactrianCamelEntity entity = null;

	public BactrianCamelRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelbactrian_camel.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BactrianCamelEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bactrian_camel.png");
	}

	private static final class AnimatedModel extends Modelbactrian_camel {
		private BactrianCamelEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(BactrianCamelEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animateWalk(CamelAnimation.CAMEL_WALK, state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.animate(entity.animationState1, CamelAnimation.CAMEL_IDLE, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}
