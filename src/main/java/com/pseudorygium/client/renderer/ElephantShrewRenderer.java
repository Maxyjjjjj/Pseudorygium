
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ElephantShrewEntity;
import com.pseudorygium.client.model.Modelelephant_shrew;

public class ElephantShrewRenderer extends MobRenderer<ElephantShrewEntity, Modelelephant_shrew<ElephantShrewEntity>> {
	public ElephantShrewRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelephant_shrew(context.bakeLayer(Modelelephant_shrew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElephantShrewEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/elephant_shrew.png");
	}
}
