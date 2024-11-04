
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ForestBuffaloEntity;
import com.pseudorygium.client.model.Modelforest_buffalo;

public class ForestBuffaloRenderer extends MobRenderer<ForestBuffaloEntity, Modelforest_buffalo<ForestBuffaloEntity>> {
	public ForestBuffaloRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelforest_buffalo(context.bakeLayer(Modelforest_buffalo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ForestBuffaloEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/forest_buffalo.png");
	}
}
