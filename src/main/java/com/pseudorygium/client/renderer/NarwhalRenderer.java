
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.NarwhalEntity;
import com.pseudorygium.client.model.Modelnarwhal;

public class NarwhalRenderer extends MobRenderer<NarwhalEntity, Modelnarwhal<NarwhalEntity>> {
	public NarwhalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnarwhal(context.bakeLayer(Modelnarwhal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NarwhalEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/narwhal.png");
	}
}
