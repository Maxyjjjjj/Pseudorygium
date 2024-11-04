
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WoollyRhinocerosEntity;
import com.pseudorygium.client.model.Modelwoolly_rhinoceros;

public class WoollyRhinocerosRenderer extends MobRenderer<WoollyRhinocerosEntity, Modelwoolly_rhinoceros<WoollyRhinocerosEntity>> {
	public WoollyRhinocerosRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwoolly_rhinoceros(context.bakeLayer(Modelwoolly_rhinoceros.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoollyRhinocerosEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/woolly_rhinoceros.png");
	}
}
