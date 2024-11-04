
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AyeAyeEntity;
import com.pseudorygium.client.model.Modelaye_aye;

public class AyeAyeRenderer extends MobRenderer<AyeAyeEntity, Modelaye_aye<AyeAyeEntity>> {
	public AyeAyeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaye_aye(context.bakeLayer(Modelaye_aye.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(AyeAyeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aye-aye.png");
	}
}
