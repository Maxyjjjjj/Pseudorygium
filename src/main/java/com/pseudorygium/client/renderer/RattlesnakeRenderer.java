
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RattlesnakeEntity;
import com.pseudorygium.client.model.Modelrattlesnake;

public class RattlesnakeRenderer extends MobRenderer<RattlesnakeEntity, Modelrattlesnake<RattlesnakeEntity>> {
	public RattlesnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrattlesnake(context.bakeLayer(Modelrattlesnake.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RattlesnakeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rattlesnake.png");
	}
}
