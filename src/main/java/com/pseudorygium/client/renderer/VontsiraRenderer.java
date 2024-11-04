
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.VontsiraEntity;
import com.pseudorygium.client.model.Modelmongoose;

public class VontsiraRenderer extends MobRenderer<VontsiraEntity, Modelmongoose<VontsiraEntity>> {
	public VontsiraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmongoose(context.bakeLayer(Modelmongoose.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VontsiraEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/vontsira.png");
	}
}
