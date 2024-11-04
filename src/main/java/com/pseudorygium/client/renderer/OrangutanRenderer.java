
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OrangutanEntity;
import com.pseudorygium.client.model.Modelorangutan;

public class OrangutanRenderer extends MobRenderer<OrangutanEntity, Modelorangutan<OrangutanEntity>> {
	public OrangutanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorangutan(context.bakeLayer(Modelorangutan.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangutanEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/orangutan.png");
	}
}
