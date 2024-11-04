
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PtarmiganEntity;
import com.pseudorygium.client.model.Modelptarmigan;

public class PtarmiganRenderer extends MobRenderer<PtarmiganEntity, Modelptarmigan<PtarmiganEntity>> {
	public PtarmiganRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelptarmigan(context.bakeLayer(Modelptarmigan.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PtarmiganEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/ptarmigan_winter.png");
	}
}
