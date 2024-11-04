
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SkunkEntity;
import com.pseudorygium.client.model.Modelskunk;

public class SkunkRenderer extends MobRenderer<SkunkEntity, Modelskunk<SkunkEntity>> {
	public SkunkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelskunk(context.bakeLayer(Modelskunk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkunkEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/skunk.png");
	}
}
