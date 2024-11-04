
package com.pseudorygium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.pseudorygium.entity.VultureEntity;
import com.pseudorygium.client.model.Modelvulture;

public class VultureRenderer extends MobRenderer<VultureEntity, Modelvulture<VultureEntity>> {
	public VultureRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvulture(context.bakeLayer(Modelvulture.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VultureEntity entity) {
		return ResourceLocation.parse("pseudorygium:textures/entities/vulture.png");
	}
}
