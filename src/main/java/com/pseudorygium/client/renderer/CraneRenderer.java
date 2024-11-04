
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CraneEntity;
import com.pseudorygium.client.model.Modelcrane;

public class CraneRenderer extends MobRenderer<CraneEntity, Modelcrane<CraneEntity>> {
	public CraneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrane(context.bakeLayer(Modelcrane.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CraneEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crane_common.png");
	}
}
