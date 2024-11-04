
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MoleEntity;
import com.pseudorygium.client.model.Modelmole;

public class MoleRenderer extends MobRenderer<MoleEntity, Modelmole<MoleEntity>> {
	public MoleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmole(context.bakeLayer(Modelmole.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/mole.png");
	}
}
