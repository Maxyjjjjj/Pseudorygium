
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BlueWhaleEntity;
import com.pseudorygium.client.model.Modelblue_whale;

public class BlueWhaleRenderer extends MobRenderer<BlueWhaleEntity, Modelblue_whale<BlueWhaleEntity>> {
	public BlueWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelblue_whale(context.bakeLayer(Modelblue_whale.LAYER_LOCATION)), 6f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueWhaleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/blue_whale.png");
	}
}
