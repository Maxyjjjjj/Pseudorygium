
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.YakEntity;
import com.pseudorygium.client.model.Modelyak;

public class YakRenderer extends MobRenderer<YakEntity, Modelyak<YakEntity>> {
	public YakRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyak(context.bakeLayer(Modelyak.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YakEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/yak_black.png");
	}
}
