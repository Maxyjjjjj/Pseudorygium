
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BeeEaterEntity;
import com.pseudorygium.client.model.Modelbeeeater;

public class BeeEaterRenderer extends MobRenderer<BeeEaterEntity, Modelbeeeater<BeeEaterEntity>> {
	public BeeEaterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeeeater(context.bakeLayer(Modelbeeeater.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BeeEaterEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/beeeater.png");
	}
}
