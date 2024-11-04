
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.StagBeetleEntity;
import com.pseudorygium.client.model.Modelstag_beetle;

public class StagBeetleRenderer extends MobRenderer<StagBeetleEntity, Modelstag_beetle<StagBeetleEntity>> {
	public StagBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstag_beetle(context.bakeLayer(Modelstag_beetle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StagBeetleEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/stag_beetle.png");
	}
}
