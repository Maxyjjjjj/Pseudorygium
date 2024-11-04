
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SwallowEntity;
import com.pseudorygium.client.model.Modelswallow;

public class SwallowRenderer extends MobRenderer<SwallowEntity, Modelswallow<SwallowEntity>> {
	public SwallowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswallow(context.bakeLayer(Modelswallow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwallowEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/swallow.png");
	}
}
