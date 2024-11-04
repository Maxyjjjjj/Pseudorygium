
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WhiteSharkEntity;
import com.pseudorygium.client.model.Modelwhite_shark;

public class WhiteSharkRenderer extends MobRenderer<WhiteSharkEntity, Modelwhite_shark<WhiteSharkEntity>> {
	public WhiteSharkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_shark(context.bakeLayer(Modelwhite_shark.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteSharkEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/white_shark.png");
	}
}
