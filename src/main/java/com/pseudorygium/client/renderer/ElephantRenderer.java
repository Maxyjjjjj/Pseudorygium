
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ElephantEntity;
import com.pseudorygium.client.model.Modelelephant;

public class ElephantRenderer extends MobRenderer<ElephantEntity, Modelelephant<ElephantEntity>> {
	public ElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelephant(context.bakeLayer(Modelelephant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElephantEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/elephant_small_tusks.png");
	}
}
