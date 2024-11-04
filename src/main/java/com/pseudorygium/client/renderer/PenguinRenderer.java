
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PenguinEntity;
import com.pseudorygium.client.model.Modelpenguin;

public class PenguinRenderer extends MobRenderer<PenguinEntity, Modelpenguin<PenguinEntity>> {
	public PenguinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpenguin(context.bakeLayer(Modelpenguin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PenguinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/penguin.png");
	}
}
