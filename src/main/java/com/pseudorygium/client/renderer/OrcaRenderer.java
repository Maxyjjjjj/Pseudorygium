
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OrcaEntity;
import com.pseudorygium.client.model.Modelorca;

public class OrcaRenderer extends MobRenderer<OrcaEntity, Modelorca<OrcaEntity>> {
	public OrcaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorca(context.bakeLayer(Modelorca.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrcaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/orca.png");
	}
}
