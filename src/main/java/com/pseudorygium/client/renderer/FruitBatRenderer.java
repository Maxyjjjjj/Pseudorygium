
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FruitBatEntity;
import com.pseudorygium.client.model.Modelfruit_bat;

public class FruitBatRenderer extends MobRenderer<FruitBatEntity, Modelfruit_bat<FruitBatEntity>> {
	public FruitBatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfruit_bat(context.bakeLayer(Modelfruit_bat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FruitBatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fruit_bat.png");
	}
}
