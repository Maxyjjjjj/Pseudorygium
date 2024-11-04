
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.FlyingSquirrelEntity;
import com.pseudorygium.client.model.Modelflying_squirrel;

public class FlyingSquirrelRenderer extends MobRenderer<FlyingSquirrelEntity, Modelflying_squirrel<FlyingSquirrelEntity>> {
	public FlyingSquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflying_squirrel(context.bakeLayer(Modelflying_squirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlyingSquirrelEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/flying_squirrel.png");
	}
}
