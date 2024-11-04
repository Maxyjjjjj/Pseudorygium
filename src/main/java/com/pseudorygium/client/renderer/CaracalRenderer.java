
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CaracalEntity;
import com.pseudorygium.client.model.Modelcaracal;

public class CaracalRenderer extends MobRenderer<CaracalEntity, Modelcaracal<CaracalEntity>> {
	public CaracalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcaracal(context.bakeLayer(Modelcaracal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaracalEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/caracal.png");
	}
}
