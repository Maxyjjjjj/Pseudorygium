
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ManateeEntity;
import com.pseudorygium.client.model.Modelmanatee;

public class ManateeRenderer extends MobRenderer<ManateeEntity, Modelmanatee<ManateeEntity>> {
	public ManateeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmanatee(context.bakeLayer(Modelmanatee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ManateeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/manatee.png");
	}
}
