
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GeckoEntity;
import com.pseudorygium.client.model.Modelgecko;

public class GeckoRenderer extends MobRenderer<GeckoEntity, Modelgecko<GeckoEntity>> {
	public GeckoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgecko(context.bakeLayer(Modelgecko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GeckoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gecko.png");
	}
}
