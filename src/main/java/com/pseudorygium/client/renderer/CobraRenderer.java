
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CobraEntity;
import com.pseudorygium.client.model.Modelcobra;

public class CobraRenderer extends MobRenderer<CobraEntity, Modelcobra<CobraEntity>> {
	public CobraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcobra(context.bakeLayer(Modelcobra.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CobraEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cobra.png");
	}
}
