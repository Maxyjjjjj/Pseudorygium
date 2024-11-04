
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DragonflyEntity;
import com.pseudorygium.client.model.Modeldragonfly;

public class DragonflyRenderer extends MobRenderer<DragonflyEntity, Modeldragonfly<DragonflyEntity>> {
	public DragonflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldragonfly(context.bakeLayer(Modeldragonfly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonflyEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/dragonfly.png");
	}
}
