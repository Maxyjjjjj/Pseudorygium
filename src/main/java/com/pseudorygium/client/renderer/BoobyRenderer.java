
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BoobyEntity;
import com.pseudorygium.client.model.Modelbooby;

public class BoobyRenderer extends MobRenderer<BoobyEntity, Modelbooby<BoobyEntity>> {
	public BoobyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbooby(context.bakeLayer(Modelbooby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BoobyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/booby.png");
	}
}
