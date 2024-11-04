
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CanaryEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class CanaryRenderer extends MobRenderer<CanaryEntity, Modelpasserine<CanaryEntity>> {
	public CanaryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CanaryEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/canary.png");
	}
}
