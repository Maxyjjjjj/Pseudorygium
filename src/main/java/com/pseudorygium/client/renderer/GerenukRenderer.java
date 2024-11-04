
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GerenukEntity;
import com.pseudorygium.client.model.Modelgerenuk;

public class GerenukRenderer extends MobRenderer<GerenukEntity, Modelgerenuk<GerenukEntity>> {
	public GerenukRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgerenuk(context.bakeLayer(Modelgerenuk.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GerenukEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gerenuk.png");
	}
}
