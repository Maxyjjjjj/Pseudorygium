
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ToucanEntity;
import com.pseudorygium.client.model.Modeltoucan;

public class ToucanRenderer extends MobRenderer<ToucanEntity, Modeltoucan<ToucanEntity>> {
	public ToucanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoucan(context.bakeLayer(Modeltoucan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToucanEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/toucan.png");
	}
}
