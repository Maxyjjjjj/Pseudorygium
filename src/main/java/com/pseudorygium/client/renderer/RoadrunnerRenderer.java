
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RoadrunnerEntity;
import com.pseudorygium.client.model.Modelroadrunner;

public class RoadrunnerRenderer extends MobRenderer<RoadrunnerEntity, Modelroadrunner<RoadrunnerEntity>> {
	public RoadrunnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroadrunner(context.bakeLayer(Modelroadrunner.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoadrunnerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/roadrunner.png");
	}
}
