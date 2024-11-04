
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GharialEntity;
import com.pseudorygium.client.model.Modelgharial;

public class GharialRenderer extends MobRenderer<GharialEntity, Modelgharial<GharialEntity>> {
	public GharialRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgharial(context.bakeLayer(Modelgharial.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(GharialEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gharial.png");
	}
}
