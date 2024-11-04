
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FossaEntity;
import com.pseudorygium.client.model.Modelfossa;

public class FossaRenderer extends MobRenderer<FossaEntity, Modelfossa<FossaEntity>> {
	public FossaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfossa(context.bakeLayer(Modelfossa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FossaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fossa.png");
	}
}
