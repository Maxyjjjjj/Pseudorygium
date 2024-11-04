
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChamoisEntity;
import com.pseudorygium.client.model.Modelchamois;

public class ChamoisRenderer extends MobRenderer<ChamoisEntity, Modelchamois<ChamoisEntity>> {
	public ChamoisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchamois(context.bakeLayer(Modelchamois.LAYER_LOCATION)), 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChamoisEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chamois.png");
	}
}
