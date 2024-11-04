
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LeopardEntity;
import com.pseudorygium.client.model.Modelleopard;

public class LeopardRenderer extends MobRenderer<LeopardEntity, Modelleopard<LeopardEntity>> {
	public LeopardRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelleopard(context.bakeLayer(Modelleopard.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(LeopardEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/leopard_regular.png");
	}
}
