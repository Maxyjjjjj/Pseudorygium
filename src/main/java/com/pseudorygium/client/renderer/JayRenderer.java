
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.JayEntity;
import com.pseudorygium.client.model.Modeljay;

public class JayRenderer extends MobRenderer<JayEntity, Modeljay<JayEntity>> {
	public JayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljay(context.bakeLayer(Modeljay.LAYER_LOCATION)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(JayEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/jay_eurasian.png");
	}
}
