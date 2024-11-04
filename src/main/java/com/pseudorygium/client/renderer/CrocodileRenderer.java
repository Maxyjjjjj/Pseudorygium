
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CrocodileEntity;
import com.pseudorygium.client.model.Modelcrocodile;

public class CrocodileRenderer extends MobRenderer<CrocodileEntity, Modelcrocodile<CrocodileEntity>> {
	public CrocodileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrocodile(context.bakeLayer(Modelcrocodile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrocodileEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/crocodile.png");
	}
}
