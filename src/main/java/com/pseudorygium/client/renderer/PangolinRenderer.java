
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PangolinEntity;
import com.pseudorygium.client.model.Modelpangolin;

public class PangolinRenderer extends MobRenderer<PangolinEntity, Modelpangolin<PangolinEntity>> {
	public PangolinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpangolin(context.bakeLayer(Modelpangolin.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(PangolinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pangolin.png");
	}
}
