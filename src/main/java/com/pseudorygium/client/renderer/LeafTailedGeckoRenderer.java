
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LeafTailedGeckoEntity;
import com.pseudorygium.client.model.Modelleaftailed_gecko;

public class LeafTailedGeckoRenderer extends MobRenderer<LeafTailedGeckoEntity, Modelleaftailed_gecko<LeafTailedGeckoEntity>> {
	public LeafTailedGeckoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelleaftailed_gecko(context.bakeLayer(Modelleaftailed_gecko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LeafTailedGeckoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/leaftailed_gecko.png");
	}
}
