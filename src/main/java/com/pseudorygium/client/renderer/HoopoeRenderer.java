
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HoopoeEntity;
import com.pseudorygium.client.model.Modelhoopoe;

public class HoopoeRenderer extends MobRenderer<HoopoeEntity, Modelhoopoe<HoopoeEntity>> {
	public HoopoeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhoopoe(context.bakeLayer(Modelhoopoe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HoopoeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hoopoe.png");
	}
}
