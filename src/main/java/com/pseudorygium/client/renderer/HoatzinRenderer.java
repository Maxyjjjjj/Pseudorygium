
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HoatzinEntity;
import com.pseudorygium.client.model.Modelhoatzin;

public class HoatzinRenderer extends MobRenderer<HoatzinEntity, Modelhoatzin<HoatzinEntity>> {
	public HoatzinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoatzin(context.bakeLayer(Modelhoatzin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoatzinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hoatzin.png");
	}
}
