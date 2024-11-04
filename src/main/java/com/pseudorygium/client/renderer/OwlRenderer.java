
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OwlEntity;
import com.pseudorygium.client.model.Modelowl;

public class OwlRenderer extends MobRenderer<OwlEntity, Modelowl<OwlEntity>> {
	public OwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelowl(context.bakeLayer(Modelowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OwlEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/owl_eagle.png");
	}
}
