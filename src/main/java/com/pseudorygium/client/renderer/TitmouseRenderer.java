
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TitmouseEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class TitmouseRenderer extends MobRenderer<TitmouseEntity, Modelpasserine<TitmouseEntity>> {
	public TitmouseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitmouseEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/titmouse.png");
	}
}
