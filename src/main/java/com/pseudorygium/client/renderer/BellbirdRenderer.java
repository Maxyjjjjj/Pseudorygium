
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BellbirdEntity;
import com.pseudorygium.client.model.Modelbellird;

public class BellbirdRenderer extends MobRenderer<BellbirdEntity, Modelbellird<BellbirdEntity>> {
	public BellbirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbellird(context.bakeLayer(Modelbellird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BellbirdEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bellbird.png");
	}
}
