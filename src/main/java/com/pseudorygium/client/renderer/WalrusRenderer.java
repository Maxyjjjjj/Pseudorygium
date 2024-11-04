
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WalrusEntity;
import com.pseudorygium.client.model.Modelwalrus;

public class WalrusRenderer extends MobRenderer<WalrusEntity, Modelwalrus<WalrusEntity>> {
	public WalrusRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwalrus(context.bakeLayer(Modelwalrus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WalrusEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/walrus.png");
	}
}
