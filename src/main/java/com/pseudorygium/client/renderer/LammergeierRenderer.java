
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LammergeierEntity;
import com.pseudorygium.client.model.Modellammergeier;

public class LammergeierRenderer extends MobRenderer<LammergeierEntity, Modellammergeier<LammergeierEntity>> {
	public LammergeierRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellammergeier(context.bakeLayer(Modellammergeier.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LammergeierEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lammergeier.png");
	}
}
