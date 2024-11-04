
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SiamangEntity;
import com.pseudorygium.client.model.Modelsiamang;

public class SiamangRenderer extends MobRenderer<SiamangEntity, Modelsiamang<SiamangEntity>> {
	public SiamangRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsiamang(context.bakeLayer(Modelsiamang.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SiamangEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/siamang.png");
	}
}
