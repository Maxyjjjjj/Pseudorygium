
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CapybaraEntity;
import com.pseudorygium.client.model.Modelcapybara;

public class CapybaraRenderer extends MobRenderer<CapybaraEntity, Modelcapybara<CapybaraEntity>> {
	public CapybaraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapybara(context.bakeLayer(Modelcapybara.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CapybaraEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/capybara.png");
	}
}
