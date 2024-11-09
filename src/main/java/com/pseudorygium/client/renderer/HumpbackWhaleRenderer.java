
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HumpbackWhaleEntity;
import com.pseudorygium.client.model.Modelhumpback_whale;

public class HumpbackWhaleRenderer extends MobRenderer<HumpbackWhaleEntity, Modelhumpback_whale<HumpbackWhaleEntity>> {
	public HumpbackWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhumpback_whale(context.bakeLayer(Modelhumpback_whale.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(HumpbackWhaleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/humpback.png");
	}
}
