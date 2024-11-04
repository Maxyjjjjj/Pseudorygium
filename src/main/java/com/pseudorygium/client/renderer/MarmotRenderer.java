
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MarmotEntity;
import com.pseudorygium.client.model.Modelmarmot;

public class MarmotRenderer extends MobRenderer<MarmotEntity, Modelmarmot<MarmotEntity>> {
	public MarmotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmarmot(context.bakeLayer(Modelmarmot.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarmotEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/marmot.png");
	}
}
