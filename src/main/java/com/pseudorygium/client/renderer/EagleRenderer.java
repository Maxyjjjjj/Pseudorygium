
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.EagleEntity;
import com.pseudorygium.client.model.Modeleagle;

public class EagleRenderer extends MobRenderer<EagleEntity, Modeleagle<EagleEntity>> {
	public EagleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeleagle(context.bakeLayer(Modeleagle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EagleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/eagle.png");
	}
}
