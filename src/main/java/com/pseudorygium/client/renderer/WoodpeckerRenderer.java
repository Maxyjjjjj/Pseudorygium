
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WoodpeckerEntity;
import com.pseudorygium.client.model.Modelwoodpecker;

public class WoodpeckerRenderer extends MobRenderer<WoodpeckerEntity, Modelwoodpecker<WoodpeckerEntity>> {
	public WoodpeckerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwoodpecker(context.bakeLayer(Modelwoodpecker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodpeckerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/woodpecker_spotted.png");
	}
}
