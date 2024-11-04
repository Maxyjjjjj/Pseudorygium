
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FlamingoEntity;
import com.pseudorygium.client.model.Modelflamingo;

public class FlamingoRenderer extends MobRenderer<FlamingoEntity, Modelflamingo<FlamingoEntity>> {
	public FlamingoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflamingo(context.bakeLayer(Modelflamingo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlamingoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/flamingo_pink.png");
	}
}
