
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.TenrecEntity;
import com.pseudorygium.client.model.Modeltenrec;

public class TenrecRenderer extends MobRenderer<TenrecEntity, Modeltenrec<TenrecEntity>> {
	public TenrecRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltenrec(context.bakeLayer(Modeltenrec.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TenrecEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/tenrec.png");
	}
}
