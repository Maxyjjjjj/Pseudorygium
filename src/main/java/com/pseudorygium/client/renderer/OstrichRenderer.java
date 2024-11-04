
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OstrichEntity;
import com.pseudorygium.client.model.Modelostrich;

public class OstrichRenderer extends MobRenderer<OstrichEntity, Modelostrich<OstrichEntity>> {
	public OstrichRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelostrich(context.bakeLayer(Modelostrich.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(OstrichEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ostrich.png");
	}
}
