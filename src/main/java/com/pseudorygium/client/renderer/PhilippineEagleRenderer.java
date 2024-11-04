
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PhilippineEagleEntity;
import com.pseudorygium.client.model.Modelphilippine_eagle;

public class PhilippineEagleRenderer extends MobRenderer<PhilippineEagleEntity, Modelphilippine_eagle<PhilippineEagleEntity>> {
	public PhilippineEagleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelphilippine_eagle(context.bakeLayer(Modelphilippine_eagle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PhilippineEagleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/philippine_eagle.png");
	}
}
