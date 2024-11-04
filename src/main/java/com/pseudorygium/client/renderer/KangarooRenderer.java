
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KangarooEntity;
import com.pseudorygium.client.model.Modelkangaroo;

public class KangarooRenderer extends MobRenderer<KangarooEntity, Modelkangaroo<KangarooEntity>> {
	public KangarooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkangaroo(context.bakeLayer(Modelkangaroo.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(KangarooEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kangaroo.png");
	}
}
