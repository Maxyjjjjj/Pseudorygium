
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SparrowEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class SparrowRenderer extends MobRenderer<SparrowEntity, Modelpasserine<SparrowEntity>> {
	public SparrowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SparrowEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/sparrow.png");
	}
}