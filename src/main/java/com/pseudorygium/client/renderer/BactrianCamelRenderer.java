
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BactrianCamelEntity;
import com.pseudorygium.client.model.Modelbactrian_camel;

public class BactrianCamelRenderer extends MobRenderer<BactrianCamelEntity, Modelbactrian_camel<BactrianCamelEntity>> {
	public BactrianCamelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbactrian_camel(context.bakeLayer(Modelbactrian_camel.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BactrianCamelEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bactrian_camel.png");
	}
}
