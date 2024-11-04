
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KaguEntity;
import com.pseudorygium.client.model.Modelkagu;

public class KaguRenderer extends MobRenderer<KaguEntity, Modelkagu<KaguEntity>> {
	public KaguRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkagu(context.bakeLayer(Modelkagu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KaguEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kagu.png");
	}
}
