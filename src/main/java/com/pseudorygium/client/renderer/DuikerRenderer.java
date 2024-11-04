
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.DuikerEntity;
import com.pseudorygium.client.model.Modelduiker;

public class DuikerRenderer extends MobRenderer<DuikerEntity, Modelduiker<DuikerEntity>> {
	public DuikerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduiker(context.bakeLayer(Modelduiker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuikerEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/duiker.png");
	}
}
