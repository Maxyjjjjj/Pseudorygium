
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.EmuEntity;
import com.pseudorygium.client.model.Modelemu;

public class EmuRenderer extends MobRenderer<EmuEntity, Modelemu<EmuEntity>> {
	public EmuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelemu(context.bakeLayer(Modelemu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EmuEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/emu.png");
	}
}
