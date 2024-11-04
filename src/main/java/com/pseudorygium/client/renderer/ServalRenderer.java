
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ServalEntity;
import com.pseudorygium.client.model.Modelserval;

public class ServalRenderer extends MobRenderer<ServalEntity, Modelserval<ServalEntity>> {
	public ServalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelserval(context.bakeLayer(Modelserval.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ServalEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/serval.png");
	}
}
