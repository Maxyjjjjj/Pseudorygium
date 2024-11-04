
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SeagullEntity;
import com.pseudorygium.client.model.Modelseagull;

public class SeagullRenderer extends MobRenderer<SeagullEntity, Modelseagull<SeagullEntity>> {
	public SeagullRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelseagull(context.bakeLayer(Modelseagull.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeagullEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/seagull.png");
	}
}
