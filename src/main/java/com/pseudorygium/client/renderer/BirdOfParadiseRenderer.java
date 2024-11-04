
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BirdOfParadiseEntity;
import com.pseudorygium.client.model.Modelbird_of_paradise;

public class BirdOfParadiseRenderer extends MobRenderer<BirdOfParadiseEntity, Modelbird_of_paradise<BirdOfParadiseEntity>> {
	public BirdOfParadiseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbird_of_paradise(context.bakeLayer(Modelbird_of_paradise.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BirdOfParadiseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bird_of_paradise.png");
	}
}
