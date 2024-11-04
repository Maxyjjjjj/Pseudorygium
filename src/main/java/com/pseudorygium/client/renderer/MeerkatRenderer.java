
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MeerkatEntity;
import com.pseudorygium.client.model.Modelmeerkat;

public class MeerkatRenderer extends MobRenderer<MeerkatEntity, Modelmeerkat<MeerkatEntity>> {
	public MeerkatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmeerkat(context.bakeLayer(Modelmeerkat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MeerkatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/meerkat.png");
	}
}
