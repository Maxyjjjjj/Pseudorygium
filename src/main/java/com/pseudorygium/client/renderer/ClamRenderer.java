
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ClamEntity;
import com.pseudorygium.client.model.Modelclam;

public class ClamRenderer extends MobRenderer<ClamEntity, Modelclam<ClamEntity>> {
	public ClamRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelclam(context.bakeLayer(Modelclam.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ClamEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/clam.png");
	}
}
