
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TerrapinEntity;
import com.pseudorygium.client.model.Modelterrapin;

public class TerrapinRenderer extends MobRenderer<TerrapinEntity, Modelterrapin<TerrapinEntity>> {
	public TerrapinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelterrapin(context.bakeLayer(Modelterrapin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TerrapinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/terrapin_black.png");
	}
}
