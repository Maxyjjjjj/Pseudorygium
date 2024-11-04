
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GorillaEntity;
import com.pseudorygium.client.model.Modelgorilla;

public class GorillaRenderer extends MobRenderer<GorillaEntity, Modelgorilla<GorillaEntity>> {
	public GorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgorilla(context.bakeLayer(Modelgorilla.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorillaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gorilla.png");
	}
}
