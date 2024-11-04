
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.HyenaEntity;
import com.pseudorygium.client.model.Modelhyena;

public class HyenaRenderer extends MobRenderer<HyenaEntity, Modelhyena<HyenaEntity>> {
	public HyenaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhyena(context.bakeLayer(Modelhyena.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HyenaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/hyena.png");
	}
}
