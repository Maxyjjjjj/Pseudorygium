
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SugarGliderEntity;
import com.pseudorygium.client.model.Modelflying_squirrel;

public class SugarGliderRenderer extends MobRenderer<SugarGliderEntity, Modelflying_squirrel<SugarGliderEntity>> {
	public SugarGliderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflying_squirrel(context.bakeLayer(Modelflying_squirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SugarGliderEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sugar_glider.png");
	}
}
