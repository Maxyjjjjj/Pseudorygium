
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.SquirrelEntity;
import com.pseudorygium.client.model.Modelsquirrel;

public class SquirrelRenderer extends MobRenderer<SquirrelEntity, Modelsquirrel<SquirrelEntity>> {
	public SquirrelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsquirrel(context.bakeLayer(Modelsquirrel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquirrelEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/squirrel.png");
	}
}
