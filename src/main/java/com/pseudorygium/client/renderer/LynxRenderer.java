
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.LynxEntity;
import com.pseudorygium.client.model.Modellynx;

public class LynxRenderer extends MobRenderer<LynxEntity, Modellynx<LynxEntity>> {
	public LynxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellynx(context.bakeLayer(Modellynx.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LynxEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/lynx.png");
	}
}
