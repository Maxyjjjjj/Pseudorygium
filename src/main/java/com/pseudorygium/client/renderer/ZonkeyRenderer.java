
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ZonkeyEntity;
import com.pseudorygium.client.model.Modelzebroid;

public class ZonkeyRenderer extends MobRenderer<ZonkeyEntity, Modelzebroid<ZonkeyEntity>> {
	public ZonkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzebroid(context.bakeLayer(Modelzebroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZonkeyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/zonkey.png");
	}
}
