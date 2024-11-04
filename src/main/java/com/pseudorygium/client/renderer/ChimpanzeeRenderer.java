
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.ChimpanzeeEntity;
import com.pseudorygium.client.model.Modelchimpanzee;

public class ChimpanzeeRenderer extends MobRenderer<ChimpanzeeEntity, Modelchimpanzee<ChimpanzeeEntity>> {
	public ChimpanzeeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchimpanzee(context.bakeLayer(Modelchimpanzee.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChimpanzeeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/chimpanzee.png");
	}
}
