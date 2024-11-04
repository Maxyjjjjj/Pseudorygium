
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AardwolfEntity;
import com.pseudorygium.client.model.Modelaardwolf;

public class AardwolfRenderer extends MobRenderer<AardwolfEntity, Modelaardwolf<AardwolfEntity>> {
	public AardwolfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaardwolf(context.bakeLayer(Modelaardwolf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AardwolfEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aardwolftexture.png");
	}
}
