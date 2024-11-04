
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SawfishEntity;
import com.pseudorygium.client.model.Modelsawfish;

public class SawfishRenderer extends MobRenderer<SawfishEntity, Modelsawfish<SawfishEntity>> {
	public SawfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsawfish(context.bakeLayer(Modelsawfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SawfishEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sawfish.png");
	}
}
