
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ManedWolfEntity;
import com.pseudorygium.client.model.Modelmaned_wolf;

public class ManedWolfRenderer extends MobRenderer<ManedWolfEntity, Modelmaned_wolf<ManedWolfEntity>> {
	public ManedWolfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaned_wolf(context.bakeLayer(Modelmaned_wolf.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ManedWolfEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/maned_wolf.png");
	}
}
