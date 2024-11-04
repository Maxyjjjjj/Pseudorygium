
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RheaEntity;
import com.pseudorygium.client.model.Modelrhea;

public class RheaRenderer extends MobRenderer<RheaEntity, Modelrhea<RheaEntity>> {
	public RheaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrhea(context.bakeLayer(Modelrhea.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RheaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rhea.png");
	}
}
