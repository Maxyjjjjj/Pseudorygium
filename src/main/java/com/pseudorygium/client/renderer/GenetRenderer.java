
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GenetEntity;
import com.pseudorygium.client.model.Modelgenet;

public class GenetRenderer extends MobRenderer<GenetEntity, Modelgenet<GenetEntity>> {
	public GenetRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgenet(context.bakeLayer(Modelgenet.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GenetEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/genet.png");
	}
}
