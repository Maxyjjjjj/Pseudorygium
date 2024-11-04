
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HummingbirdEntity;
import com.pseudorygium.client.model.Modelhummingbird;

public class HummingbirdRenderer extends MobRenderer<HummingbirdEntity, Modelhummingbird<HummingbirdEntity>> {
	public HummingbirdRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhummingbird(context.bakeLayer(Modelhummingbird.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HummingbirdEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hummingbird.png");
	}
}
