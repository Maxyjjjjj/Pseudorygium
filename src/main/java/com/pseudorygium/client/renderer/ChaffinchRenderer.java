
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChaffinchEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class ChaffinchRenderer extends MobRenderer<ChaffinchEntity, Modelpasserine<ChaffinchEntity>> {
	public ChaffinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChaffinchEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chaffinch.png");
	}
}
