
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KomodoDragonEntity;
import com.pseudorygium.client.model.Modelkomodo_dragon;

public class KomodoDragonRenderer extends MobRenderer<KomodoDragonEntity, Modelkomodo_dragon<KomodoDragonEntity>> {
	public KomodoDragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkomodo_dragon(context.bakeLayer(Modelkomodo_dragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KomodoDragonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/komodo_dragon.png");
	}
}
