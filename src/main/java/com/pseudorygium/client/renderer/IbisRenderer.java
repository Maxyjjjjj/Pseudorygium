
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.IbisEntity;
import com.pseudorygium.client.model.Modelibis;

public class IbisRenderer extends MobRenderer<IbisEntity, Modelibis<IbisEntity>> {
	public IbisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelibis(context.bakeLayer(Modelibis.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IbisEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ibis.png");
	}
}
