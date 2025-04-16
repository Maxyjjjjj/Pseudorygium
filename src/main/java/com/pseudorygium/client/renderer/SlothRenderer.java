
package com.pseudorygium.client.renderer;

public class SlothRenderer extends MobRenderer<SlothEntity, LivingEntityRenderState, Modelsloth> {
	private SlothEntity entity = null;

	public SlothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsloth(context.bakeLayer(Modelsloth.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SlothEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sloth.png");
	}
}
