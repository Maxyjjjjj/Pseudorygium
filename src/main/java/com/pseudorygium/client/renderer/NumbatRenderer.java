
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.NumbatEntity;
import com.pseudorygium.client.model.Modelnumbat;

public class NumbatRenderer extends MobRenderer<NumbatEntity, Modelnumbat<NumbatEntity>> {
	public NumbatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnumbat(context.bakeLayer(Modelnumbat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NumbatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/numbat.png");
	}
}
