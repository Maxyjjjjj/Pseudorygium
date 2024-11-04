
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CrayfishEntity;
import com.pseudorygium.client.model.Modelcrayfish;

public class CrayfishRenderer extends MobRenderer<CrayfishEntity, Modelcrayfish<CrayfishEntity>> {
	public CrayfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrayfish(context.bakeLayer(Modelcrayfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrayfishEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crayfish.png");
	}
}
