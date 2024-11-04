
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WolverineEntity;
import com.pseudorygium.client.model.Modelwolverine;

public class WolverineRenderer extends MobRenderer<WolverineEntity, Modelwolverine<WolverineEntity>> {
	public WolverineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwolverine(context.bakeLayer(Modelwolverine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WolverineEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wolverine.png");
	}
}
