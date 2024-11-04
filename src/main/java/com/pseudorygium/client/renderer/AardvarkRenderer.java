
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.AardvarkEntity;
import com.pseudorygium.client.model.Modelaardvark;

public class AardvarkRenderer extends MobRenderer<AardvarkEntity, Modelaardvark<AardvarkEntity>> {
	public AardvarkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelaardvark(context.bakeLayer(Modelaardvark.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(AardvarkEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/aardvark.png");
	}
}
