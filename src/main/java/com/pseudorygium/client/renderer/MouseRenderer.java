
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MouseEntity;
import com.pseudorygium.client.model.Modelmouse;

public class MouseRenderer extends MobRenderer<MouseEntity, Modelmouse<MouseEntity>> {
	public MouseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouse(context.bakeLayer(Modelmouse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MouseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mouse_grey.png");
	}
}
