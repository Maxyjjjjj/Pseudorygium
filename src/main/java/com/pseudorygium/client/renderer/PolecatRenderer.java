
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PolecatEntity;
import com.pseudorygium.client.model.Modelferret;

public class PolecatRenderer extends MobRenderer<PolecatEntity, Modelferret<PolecatEntity>> {
	public PolecatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelferret(context.bakeLayer(Modelferret.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PolecatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/polecat.png");
	}
}
