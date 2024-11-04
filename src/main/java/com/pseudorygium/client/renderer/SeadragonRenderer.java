
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeadragonEntity;
import com.pseudorygium.client.model.Modelseadragon;

public class SeadragonRenderer extends MobRenderer<SeadragonEntity, Modelseadragon<SeadragonEntity>> {
	public SeadragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseadragon(context.bakeLayer(Modelseadragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeadragonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seadragon.png");
	}
}
