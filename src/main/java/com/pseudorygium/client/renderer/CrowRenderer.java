
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CrowEntity;
import com.pseudorygium.client.model.Modelcorvid;

public class CrowRenderer extends MobRenderer<CrowEntity, Modelcorvid<CrowEntity>> {
	public CrowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvid(context.bakeLayer(Modelcorvid.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrowEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crow_hooded.png");
	}
}
