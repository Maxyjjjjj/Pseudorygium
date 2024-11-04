
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PronghornEntity;
import com.pseudorygium.client.model.Modelpronghorn;

public class PronghornRenderer extends MobRenderer<PronghornEntity, Modelpronghorn<PronghornEntity>> {
	public PronghornRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpronghorn(context.bakeLayer(Modelpronghorn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PronghornEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pronghorn.png");
	}
}
