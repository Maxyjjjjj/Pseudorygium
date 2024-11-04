
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TortoiseEntity;
import com.pseudorygium.client.model.Modeltortoise;

public class TortoiseRenderer extends MobRenderer<TortoiseEntity, Modeltortoise<TortoiseEntity>> {
	public TortoiseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltortoise(context.bakeLayer(Modeltortoise.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(TortoiseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tortoise.png");
	}
}
