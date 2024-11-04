
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AntEntity;
import com.pseudorygium.client.model.Modelant;

public class AntRenderer extends MobRenderer<AntEntity, Modelant<AntEntity>> {
	public AntRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelant(context.bakeLayer(Modelant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AntEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ant.png");
	}
}
