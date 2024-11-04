
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.RatEntity;
import com.pseudorygium.client.model.Modelrat;

public class RatRenderer extends MobRenderer<RatEntity, Modelrat<RatEntity>> {
	public RatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrat(context.bakeLayer(Modelrat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/rat_grey.png");
	}
}
