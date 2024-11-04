
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MantisShrimpEntity;
import com.pseudorygium.client.model.Modelmantis_shrimp;

public class MantisShrimpRenderer extends MobRenderer<MantisShrimpEntity, Modelmantis_shrimp<MantisShrimpEntity>> {
	public MantisShrimpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmantis_shrimp(context.bakeLayer(Modelmantis_shrimp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MantisShrimpEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mantis_shrimp.png");
	}
}
