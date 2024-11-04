
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SiskinEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class SiskinRenderer extends MobRenderer<SiskinEntity, Modelpasserine<SiskinEntity>> {
	public SiskinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SiskinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/siskin.png");
	}
}
