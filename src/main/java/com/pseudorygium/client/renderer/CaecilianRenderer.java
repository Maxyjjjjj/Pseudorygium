
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CaecilianEntity;
import com.pseudorygium.client.model.Modelcaecilian;

public class CaecilianRenderer extends MobRenderer<CaecilianEntity, Modelcaecilian<CaecilianEntity>> {
	public CaecilianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaecilian(context.bakeLayer(Modelcaecilian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaecilianEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/caecilian.png");
	}
}
