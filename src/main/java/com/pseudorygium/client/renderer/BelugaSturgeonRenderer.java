
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BelugaSturgeonEntity;
import com.pseudorygium.client.model.Modelbeluga_sturgeon;

public class BelugaSturgeonRenderer extends MobRenderer<BelugaSturgeonEntity, Modelbeluga_sturgeon<BelugaSturgeonEntity>> {
	public BelugaSturgeonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbeluga_sturgeon(context.bakeLayer(Modelbeluga_sturgeon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BelugaSturgeonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/beluga_sturgeon.png");
	}
}
