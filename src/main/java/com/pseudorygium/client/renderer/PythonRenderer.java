
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PythonEntity;
import com.pseudorygium.client.model.Modelpython;

public class PythonRenderer extends MobRenderer<PythonEntity, Modelpython<PythonEntity>> {
	public PythonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpython(context.bakeLayer(Modelpython.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PythonEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/python.png");
	}
}
