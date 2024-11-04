
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LemurEntity;
import com.pseudorygium.client.model.Modellemur;

public class LemurRenderer extends MobRenderer<LemurEntity, Modellemur<LemurEntity>> {
	public LemurRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellemur(context.bakeLayer(Modellemur.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LemurEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lemur.png");
	}
}
