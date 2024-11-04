
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ThylacineEntity;
import com.pseudorygium.client.model.Modelthylacine;

public class ThylacineRenderer extends MobRenderer<ThylacineEntity, Modelthylacine<ThylacineEntity>> {
	public ThylacineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthylacine(context.bakeLayer(Modelthylacine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThylacineEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/thylacine.png");
	}
}
