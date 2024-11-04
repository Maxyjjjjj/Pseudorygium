
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BelugaWhaleEntity;
import com.pseudorygium.client.model.Modelbeluga_whale;

public class BelugaWhaleRenderer extends MobRenderer<BelugaWhaleEntity, Modelbeluga_whale<BelugaWhaleEntity>> {
	public BelugaWhaleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeluga_whale(context.bakeLayer(Modelbeluga_whale.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BelugaWhaleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dolphin5.png");
	}
}
