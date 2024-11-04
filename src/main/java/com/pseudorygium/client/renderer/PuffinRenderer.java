
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PuffinEntity;
import com.pseudorygium.client.model.Modelpuffin;

public class PuffinRenderer extends MobRenderer<PuffinEntity, Modelpuffin<PuffinEntity>> {
	public PuffinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpuffin(context.bakeLayer(Modelpuffin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PuffinEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/puffin.png");
	}
}
