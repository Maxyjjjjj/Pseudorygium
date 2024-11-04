
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.EarthwormEntityEntity;
import com.pseudorygium.client.model.Modelearthworm;

public class EarthwormEntityRenderer extends MobRenderer<EarthwormEntityEntity, Modelearthworm<EarthwormEntityEntity>> {
	public EarthwormEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthworm(context.bakeLayer(Modelearthworm.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EarthwormEntityEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/earthworm.png");
	}
}
