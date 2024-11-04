
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.WarthogEntity;
import com.pseudorygium.client.model.Modelwarthog;

public class WarthogRenderer extends MobRenderer<WarthogEntity, Modelwarthog<WarthogEntity>> {
	public WarthogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwarthog(context.bakeLayer(Modelwarthog.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WarthogEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/warthog.png");
	}
}
