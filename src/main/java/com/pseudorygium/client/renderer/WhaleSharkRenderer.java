
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WhaleSharkEntity;
import com.pseudorygium.client.model.Modelwhale_shark;

public class WhaleSharkRenderer extends MobRenderer<WhaleSharkEntity, Modelwhale_shark<WhaleSharkEntity>> {
	public WhaleSharkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhale_shark(context.bakeLayer(Modelwhale_shark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhaleSharkEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/whale_shark.png");
	}
}
