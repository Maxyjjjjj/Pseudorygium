
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.IguanaEntity;
import com.pseudorygium.client.model.Modeliguana;

public class IguanaRenderer extends MobRenderer<IguanaEntity, Modeliguana<IguanaEntity>> {
	public IguanaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeliguana(context.bakeLayer(Modeliguana.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IguanaEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/iguana.png");
	}
}
