
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AgamaEntity;
import com.pseudorygium.client.model.Modelagama;

public class AgamaRenderer extends MobRenderer<AgamaEntity, Modelagama<AgamaEntity>> {
	public AgamaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelagama(context.bakeLayer(Modelagama.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AgamaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/agama.png");
	}
}
