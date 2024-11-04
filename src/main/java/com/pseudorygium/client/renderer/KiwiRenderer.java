
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.KiwiEntity;
import com.pseudorygium.client.model.Modelkiwi;

public class KiwiRenderer extends MobRenderer<KiwiEntity, Modelkiwi<KiwiEntity>> {
	public KiwiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiwi(context.bakeLayer(Modelkiwi.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(KiwiEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/kiwi.png");
	}
}
