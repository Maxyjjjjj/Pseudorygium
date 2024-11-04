
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DodoEntity;
import com.pseudorygium.client.model.Modeldodo;

public class DodoRenderer extends MobRenderer<DodoEntity, Modeldodo<DodoEntity>> {
	public DodoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldodo(context.bakeLayer(Modeldodo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DodoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dodo.png");
	}
}
