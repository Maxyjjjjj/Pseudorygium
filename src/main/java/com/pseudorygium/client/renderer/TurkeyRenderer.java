
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TurkeyEntity;
import com.pseudorygium.client.model.Modelturkey;

public class TurkeyRenderer extends MobRenderer<TurkeyEntity, Modelturkey<TurkeyEntity>> {
	public TurkeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelturkey(context.bakeLayer(Modelturkey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurkeyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/turkey.png");
	}
}
