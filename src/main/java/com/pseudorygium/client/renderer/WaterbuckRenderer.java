
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WaterbuckEntity;
import com.pseudorygium.client.model.Modelwaterbuck;

public class WaterbuckRenderer extends MobRenderer<WaterbuckEntity, Modelwaterbuck<WaterbuckEntity>> {
	public WaterbuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwaterbuck(context.bakeLayer(Modelwaterbuck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WaterbuckEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/waterbuck.png");
	}
}
