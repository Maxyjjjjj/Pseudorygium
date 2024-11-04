
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.BullfinchEntity;
import com.pseudorygium.client.model.Modelpasserine;

public class BullfinchRenderer extends MobRenderer<BullfinchEntity, Modelpasserine<BullfinchEntity>> {
	public BullfinchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpasserine(context.bakeLayer(Modelpasserine.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BullfinchEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/bullfinch.png");
	}
}
