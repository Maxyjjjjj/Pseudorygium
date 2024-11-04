
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.PotooEntity;
import com.pseudorygium.client.model.Modelpotoo;

public class PotooRenderer extends MobRenderer<PotooEntity, Modelpotoo<PotooEntity>> {
	public PotooRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpotoo(context.bakeLayer(Modelpotoo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PotooEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/potoo.png");
	}
}
