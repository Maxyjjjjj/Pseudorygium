
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DomesticGoatEntity;
import com.pseudorygium.client.model.Modeldomestic_goat;

public class DomesticGoatRenderer extends MobRenderer<DomesticGoatEntity, Modeldomestic_goat<DomesticGoatEntity>> {
	public DomesticGoatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldomestic_goat(context.bakeLayer(Modeldomestic_goat.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DomesticGoatEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/domestic_goat_buck.png");
	}
}
