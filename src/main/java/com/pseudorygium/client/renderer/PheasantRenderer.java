
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PheasantEntity;
import com.pseudorygium.client.model.Modelpheasant;

public class PheasantRenderer extends MobRenderer<PheasantEntity, Modelpheasant<PheasantEntity>> {
	public PheasantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpheasant(context.bakeLayer(Modelpheasant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PheasantEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/pheasant.png");
	}
}
