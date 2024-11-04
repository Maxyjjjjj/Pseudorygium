
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WildBoarEntity;
import com.pseudorygium.client.model.Modelwild_boar;

public class WildBoarRenderer extends MobRenderer<WildBoarEntity, Modelwild_boar<WildBoarEntity>> {
	public WildBoarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwild_boar(context.bakeLayer(Modelwild_boar.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WildBoarEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/wild_boar.png");
	}
}
