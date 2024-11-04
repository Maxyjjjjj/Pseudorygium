
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AnoleEntity;
import com.pseudorygium.client.model.Modelanole;

public class AnoleRenderer extends MobRenderer<AnoleEntity, Modelanole<AnoleEntity>> {
	public AnoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelanole(context.bakeLayer(Modelanole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AnoleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/anole.png");
	}
}
