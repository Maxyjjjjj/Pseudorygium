
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GibbonEntity;
import com.pseudorygium.client.model.Modelgibbon;

public class GibbonRenderer extends MobRenderer<GibbonEntity, Modelgibbon<GibbonEntity>> {
	public GibbonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgibbon(context.bakeLayer(Modelgibbon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GibbonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/gibbonblack.png");
	}
}
