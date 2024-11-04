
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FennecFoxEntity;
import com.pseudorygium.client.model.Modelfennec_fox;

public class FennecFoxRenderer extends MobRenderer<FennecFoxEntity, Modelfennec_fox<FennecFoxEntity>> {
	public FennecFoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfennec_fox(context.bakeLayer(Modelfennec_fox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FennecFoxEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/fennex_fox.png");
	}
}
