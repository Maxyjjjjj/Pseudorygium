
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OkapiEntity;
import com.pseudorygium.client.model.Modelokapi;

public class OkapiRenderer extends MobRenderer<OkapiEntity, Modelokapi<OkapiEntity>> {
	public OkapiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelokapi(context.bakeLayer(Modelokapi.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(OkapiEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/okapi.png");
	}
}
