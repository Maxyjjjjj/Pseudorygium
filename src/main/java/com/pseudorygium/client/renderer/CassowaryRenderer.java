
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.CassowaryEntity;
import com.pseudorygium.client.model.Modelcassowary;

public class CassowaryRenderer extends MobRenderer<CassowaryEntity, Modelcassowary<CassowaryEntity>> {
	public CassowaryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcassowary(context.bakeLayer(Modelcassowary.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CassowaryEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/cassowary.png");
	}
}
