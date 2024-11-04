
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MaraEntity;
import com.pseudorygium.client.model.Modelmara;

public class MaraRenderer extends MobRenderer<MaraEntity, Modelmara<MaraEntity>> {
	public MaraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmara(context.bakeLayer(Modelmara.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MaraEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mara.png");
	}
}
