
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.MolochEntity;
import com.pseudorygium.client.model.Modelmoloch;

public class MolochRenderer extends MobRenderer<MolochEntity, Modelmoloch<MolochEntity>> {
	public MolochRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoloch(context.bakeLayer(Modelmoloch.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MolochEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/moloch.png");
	}
}
