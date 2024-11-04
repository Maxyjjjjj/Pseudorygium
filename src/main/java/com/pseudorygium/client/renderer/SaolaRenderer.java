
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SaolaEntity;
import com.pseudorygium.client.model.Modelsaola;

public class SaolaRenderer extends MobRenderer<SaolaEntity, Modelsaola<SaolaEntity>> {
	public SaolaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaola(context.bakeLayer(Modelsaola.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaolaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/saola.png");
	}
}
