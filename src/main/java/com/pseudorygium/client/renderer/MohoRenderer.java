
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MohoEntity;
import com.pseudorygium.client.model.Modelmoho;

public class MohoRenderer extends MobRenderer<MohoEntity, Modelmoho<MohoEntity>> {
	public MohoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoho(context.bakeLayer(Modelmoho.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MohoEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/moho.png");
	}
}
