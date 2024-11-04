
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SitatungaEntity;
import com.pseudorygium.client.model.Modelsitatunga;

public class SitatungaRenderer extends MobRenderer<SitatungaEntity, Modelsitatunga<SitatungaEntity>> {
	public SitatungaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsitatunga(context.bakeLayer(Modelsitatunga.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(SitatungaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sitatunga.png");
	}
}
