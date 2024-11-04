
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LadybugEntity;
import com.pseudorygium.client.model.Modelladybug;

public class LadybugRenderer extends MobRenderer<LadybugEntity, Modelladybug<LadybugEntity>> {
	public LadybugRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelladybug(context.bakeLayer(Modelladybug.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LadybugEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ladybug.png");
	}
}
