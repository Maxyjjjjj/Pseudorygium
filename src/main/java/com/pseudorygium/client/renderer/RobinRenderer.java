
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RobinEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class RobinRenderer extends MobRenderer<RobinEntity, Modelpasserine<RobinEntity>> {
	public RobinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RobinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/robin.png");
	}
}