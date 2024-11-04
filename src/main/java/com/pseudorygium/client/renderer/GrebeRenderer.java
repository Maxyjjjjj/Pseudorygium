
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.GrebeEntity;
import com.pseudorygium.client.model.Modelgrebe;

public class GrebeRenderer extends MobRenderer<GrebeEntity, Modelgrebe<GrebeEntity>> {
	public GrebeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgrebe(context.bakeLayer(Modelgrebe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GrebeEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/grebe.png");
	}
}
