
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SnowyOwlEntity;
import com.pseudorygium.client.model.Modelowl;

public class SnowyOwlRenderer extends MobRenderer<SnowyOwlEntity, Modelowl<SnowyOwlEntity>> {
	public SnowyOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelowl(context.bakeLayer(Modelowl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnowyOwlEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/owl_snowy.png");
	}
}
