
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MantisEntity;
import com.pseudorygium.client.model.Modelmantis;

public class MantisRenderer extends MobRenderer<MantisEntity, Modelmantis<MantisEntity>> {
	public MantisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmantis(context.bakeLayer(Modelmantis.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(MantisEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mantis.png");
	}
}
