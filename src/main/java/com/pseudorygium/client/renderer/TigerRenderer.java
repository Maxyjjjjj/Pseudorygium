
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TigerEntity;
import com.pseudorygium.client.model.Modeltiger;

public class TigerRenderer extends MobRenderer<TigerEntity, Modeltiger<TigerEntity>> {
	public TigerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltiger(context.bakeLayer(Modeltiger.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(TigerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tiger_wild.png");
	}
}
