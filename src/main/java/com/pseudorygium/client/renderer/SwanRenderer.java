
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SwanEntity;
import com.pseudorygium.client.model.Modelswan;

public class SwanRenderer extends MobRenderer<SwanEntity, Modelswan<SwanEntity>> {
	public SwanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswan(context.bakeLayer(Modelswan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwanEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/swan.png");
	}
}
