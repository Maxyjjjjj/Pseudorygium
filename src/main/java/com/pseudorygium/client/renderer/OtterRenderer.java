
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.OtterEntity;
import com.pseudorygium.client.model.Modelotter;

public class OtterRenderer extends MobRenderer<OtterEntity, Modelotter<OtterEntity>> {
	public OtterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelotter(context.bakeLayer(Modelotter.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OtterEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/otter.png");
	}
}
